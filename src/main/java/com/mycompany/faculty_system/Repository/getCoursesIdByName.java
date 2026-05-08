/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class getCoursesIdByName {
    
    private DbConnector connector = new DbConnector();
    private int id;
    
    public void handle(int couseId) throws SQLException {
        String sql = "SELECT * FROM courses WHERE course_id = ?";

        PreparedStatement ps = connector.database().prepareStatement(sql);
        ps.setInt(1, couseId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            this.id = rs.getInt("course_id");
        } else {
            throw new SQLException("Department not found");
        }
    }
    public int getId(){
        return id;
    }
}
