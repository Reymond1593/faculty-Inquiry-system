/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Utilities.Alert;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author arjay
 */
public class deleteUser {
    private DbConnector connector = new DbConnector();
    public void handle(int userId) throws SQLException{
         String sql = "DELETE FROM users WHERE user_id = ?";
         PreparedStatement ps = connector.database().prepareStatement(sql);
         ps.setInt(1, userId);
         ps.executeUpdate();
         Alert.showSuccess("User successfully delete");
    }
}
