/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Roles;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Service.ValidateUser;
import com.mycompany.faculty_system.Utilities.Alert;
import com.mycompany.faculty_system.Utilities.PasswordUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author arjay
 */
public class UserRepository {
    
    private DbConnector connector = new DbConnector();
    private ValidateUser validate = new ValidateUser();
    
    
    public void addUser(User user) throws SQLException {
        if(validate.checkField(user) == false || validate.matchPassword(user) == false){
            throw new SQLException("Fill all the blank and check password match");
        }
            String sql = "INSERT INTO `user`(`first_name`, `last_name`, `email`, `password`, `role`) "
                    + "VALUES (?,?,?,?,?)";
            
            String hashPassword = PasswordUtil.hashPassword(user.getPassword());

            PreparedStatement ps = connector.database().prepareStatement(sql);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getEmail());
            ps.setString(4, hashPassword);
            //ps.setString(5, user.getRoleId());

            ps.executeUpdate();
            
            Alert.showSuccess("User Successfully add");
        
    }

    public User getUser(User user) throws SQLException {
        
        if(user.getEmail().isEmpty() || user.getPassword().isEmpty()){
            throw new SQLException("Fill All the Blank !");
        }
        String sql = "SELECT * FROM users u JOIN roles r ON u.role_id = r.role_id WHERE u.email = ?";
        
        PreparedStatement ps = connector.database().prepareStatement(sql);
        ps.setString(1, user.getEmail());

        ResultSet rs = ps.executeQuery();
        
        if(!rs.next()) {
            throw new SQLException("No data found");
        }              
        String password = user.getPassword();
        String dbPassword = rs.getString("password");    

//        if(!PasswordUtil.verifyPassword(password, dbPassword)){
//            throw new SQLException("Wrong email and Password");  
//        }
        if(!password.equals(dbPassword)){
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
