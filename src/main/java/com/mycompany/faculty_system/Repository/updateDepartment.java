/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author arjay
 */
public class updateDepartment {
    private DbConnector connector = new DbConnector();
    public void handle(int deptId, String deptName) throws SQLException {

        String sql = "UPDATE departments SET dept_name = ? WHERE dept_id = ?";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ps.setString(1, deptName);
        ps.setInt(2, deptId);

        ps.executeUpdate();
    }
}
