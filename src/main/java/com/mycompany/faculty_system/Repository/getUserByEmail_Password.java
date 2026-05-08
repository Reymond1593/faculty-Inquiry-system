/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Roles;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Utilities.PasswordUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class getUserByEmail_Password {
    
    private DbConnector connector = new DbConnector();

    public User handle(User user) throws SQLException{
        
        String sql = "SELECT * FROM users u JOIN roles r ON u.role_id = r.role_id WHERE u.email = ?";
        
        PreparedStatement ps = connector.database().prepareStatement(sql);
        ps.setString(1, user.getEmail());

        ResultSet rs = ps.executeQuery();
        
        if(!rs.next()) {
            throw new SQLException("No data found");
        }              
        String password = user.getPassword();
        String dbPassword = rs.getString("password");    

        if(!PasswordUtil.verifyPassword(password, dbPassword)){
            throw new SQLException("Wrong email and Password");  
        }
        
        Roles roles = new Roles();
        roles.setId(rs.getInt("role_id"));
        roles.setName(rs.getString("role_name"));
        
        User dbUser = new User();
        dbUser.setRoles(roles);
        dbUser.setFirstname(rs.getString("first_name"));
        dbUser.setLastname(rs.getString("last_name"));
        return dbUser;
    }
}
