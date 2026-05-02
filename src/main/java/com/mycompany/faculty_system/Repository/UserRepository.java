/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Service.ValidateUser;
import com.mycompany.faculty_system.Utilities.Alert;
import com.mycompany.faculty_system.Utilities.PasswordUtil;
import java.sql.PreparedStatement;
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
            Alert.showError("Fill all the blank and check password match");
        }else{
            String sql = "INSERT INTO `user`(`first_name`, `last_name`, `email`, `password`, `role`) "
                    + "VALUES (?,?,?,?,?)";
            
            String hashPassword = PasswordUtil.hashPassword(user.getPassword());

            PreparedStatement ps = connector.database().prepareStatement(sql);
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setString(3, user.getEmail());
            ps.setString(4, hashPassword);
            ps.setString(5, user.getRole());

            ps.executeUpdate();
            
            Alert.showSuccess("User Successfully add");
        }
    }
    
}
