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
    
    public void addInstructor(User user) throws SQLException {
        addInstructor add = new addInstructor();
        add.handle(user);
    }
    public void addStudent(User user) throws SQLException {
        addStudent add = new addStudent();
        add.handle(user);
    }

    public User getUser(User user) throws SQLException {
        getUserByEmail_Password get = new getUserByEmail_Password();
        return get.handle(user);
    }
    
}
