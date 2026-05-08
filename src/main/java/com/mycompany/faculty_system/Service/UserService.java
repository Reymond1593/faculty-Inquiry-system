/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Components.ComboItem;
import com.mycompany.faculty_system.UserLogin;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Repository.UserRepository;
import com.mycompany.faculty_system.UserFrame;
import com.mycompany.faculty_system.UserRegistration;
import com.mycompany.faculty_system.Utilities.Alert;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class UserService {
    //login user
    public void loginUser(String user_email, String user_password, ActionEvent evt) {
        try {
            UserRepository repo = new UserRepository();
            User dbUser = repo.getUser(user_email, user_password);

            // Close LoginView
            UserLogin login = (UserLogin) javax.swing.SwingUtilities
                    .getWindowAncestor((java.awt.Component) evt.getSource());

            login.dispose();
            
            UserFrame frame = new UserFrame();
            frame.configureUser(dbUser.getRoles().getName());
            frame.setProfile(dbUser);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        } catch (SQLException ex) {
            Alert.showError(ex.getMessage());
        }
       
    }
    public void registerUser(String user_firstname, String user_lastName, String user_email, String user_password, String user_confirmPassword, ComboItem selectedItem, int roleId, ActionEvent evt) {
        try {
            if (!user_password.equals(user_confirmPassword)) {
                Alert.showError("Password and Confirm Password do not match");
                return;
            }
            
            UserRepository repo = new UserRepository();
            
            if(roleId == 2){
                    repo.addInstructor(
                        user_firstname,
                        user_lastName,
                        user_email,
                        user_password,
                        selectedItem,
                        roleId
                );
            }
            if(roleId == 3){
                    repo.addStudent(
                        user_firstname,
                        user_lastName,
                        user_email,
                        user_password,
                        selectedItem,
                        roleId
                );
            }


            // Close LoginView
            UserRegistration register = (UserRegistration) javax.swing.SwingUtilities
                    .getWindowAncestor((java.awt.Component) evt.getSource());

            register.dispose();
            
            UserLogin login = new UserLogin();
            login.pack();
            login.setLocationRelativeTo(null);
            login.setVisible(true);

        } catch (SQLException ex) {
            Alert.showError(ex.getMessage());
        }
       
    }
    
}
