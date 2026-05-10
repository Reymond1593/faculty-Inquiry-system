/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Utilities.Alert;
import com.mycompany.faculty_system.Utilities.PasswordUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class addStudent {
    
    private final DbConnector connector = new DbConnector();
    
    
    public void handle(User user) throws SQLException {
        getCoursesIdByName courseId = new getCoursesIdByName();
        courseId.handle(user.getCourses().getId());


        String sql = "INSERT INTO users (first_name, last_name, email, password, role_id, course_id) " +
                     "VALUES (?,?,?,?,?,?)";

        String hashPassword = PasswordUtil.hashPassword(user.getPassword());

        PreparedStatement ps = connector.database().prepareStatement(sql);
        ps.setString(1, user.getFirstname());
        ps.setString(2, user.getLastname());
        ps.setString(3, user.getEmail());
        ps.setString(4, hashPassword);
        ps.setInt(5, user.getRoles().getId());
        ps.setInt(6, courseId.getId()); 

        ps.executeUpdate();

        Alert.showSuccess("User successfully added");
    }
}
