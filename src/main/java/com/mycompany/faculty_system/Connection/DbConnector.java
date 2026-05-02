/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arjay
 */
public class DbConnector {
    private final String dbName = "jdbc:mysql://localhost:3306/faculty_inquiry_system";
    private final String userName = "root";
    private final String password = "";
    
    public Connection database() throws SQLException{
        Connection conn = DriverManager.getConnection(
                dbName, userName, password
        );
        return conn;
    }
}
