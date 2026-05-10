package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class getListOfUsersAndDepartments {

    private DbConnector connector = new DbConnector();

    public DefaultTableModel handle() {

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Instructor Name");
        model.addColumn("Student Name");
        model.addColumn("Department Name");

        String sql = """
            SELECT 
                MAX(CASE WHEN users.role_id = 2 THEN users.first_name END) AS instructor_name,
                MAX(CASE WHEN users.role_id = 3 THEN users.first_name END) AS student_name,
                departments.dept_name AS department_name
            FROM departments
            LEFT JOIN users 
                ON users.dept_id = departments.dept_id
            GROUP BY departments.dept_id, departments.dept_name
        """;

        try {

            PreparedStatement ps = connector.database().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{
                    rs.getString("instructor_name"),
                    rs.getString("student_name"),
                    rs.getString("department_name")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }
}