/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author arjay
 */
public class updateUser {
    private DbConnector connector = new DbConnector();
    
    public void handle(User user, int userId) throws SQLException{
                    String sql =
                    "UPDATE users "
                    + "SET first_name = ?, last_name = ?, email = ? "
                    + "WHERE user_id = ?";

            PreparedStatement ps = connector.database().prepareStatement(sql);

            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getEmail());
            ps.setInt(4, userId);

            ps.executeUpdate();
    }
}
