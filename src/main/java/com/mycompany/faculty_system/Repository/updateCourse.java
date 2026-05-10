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
public class updateCourse {
    private DbConnector connector = new DbConnector();
    public void handle(int deptId, String deptName) throws SQLException {

        String sql = "UPDATE courses SET course_name = ? WHERE course_id = ?";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ps.setString(1, deptName);
        ps.setInt(2, deptId);

        ps.executeUpdate();
    }
}
