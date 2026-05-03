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
public class getDepartmentIdByName {
    
    private DbConnector connector = new DbConnector();
    private int id;
    
    public void handle(String deptName) throws SQLException {
        String sql = "SELECT dept_id FROM departments WHERE dept_name = ?";

        PreparedStatement ps = connector.database().prepareStatement(sql);
        ps.setString(1, deptName);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            this.id = rs.getInt("dept_id");
        } else {
            throw new SQLException("Department not found");
        }
    }
    public int getId(){
        return id;
    }
}
