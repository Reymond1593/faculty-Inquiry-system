package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Departments;
import com.mycompany.faculty_system.Utilities.Alert;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addDepartments {

    private final DbConnector connector = new DbConnector();

    public void handle(Departments departments) throws SQLException {

        String sql = "INSERT INTO departments (dept_name) VALUES (?)";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ps.setString(1, departments.getName());

        ps.executeUpdate();

        Alert.showSuccess("Department successfully added");
    }
}