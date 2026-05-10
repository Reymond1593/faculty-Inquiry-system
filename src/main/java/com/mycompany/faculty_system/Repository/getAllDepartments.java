/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Model.UserUI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author arjay
 */
public class getAllDepartments {
    private DbConnector connector = new DbConnector();
    
    public ArrayList<DepartmentUI> handle() throws SQLException {

        ArrayList<DepartmentUI> departments = new ArrayList<>();

        String sql = "SELECT * FROM departments";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            DepartmentUI dept = new DepartmentUI(
                    rs.getInt("dept_id"),
                    rs.getString("dept_name")
            );

            departments.add(dept);
        }

        return departments;
    }
}
