/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Courses;
import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Model.UserUI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author arjay
 */
public class getAllCoures {
    private DbConnector connector = new DbConnector();
    
    public ArrayList<Courses> handle() throws SQLException {

        ArrayList<Courses> courses = new ArrayList<>();

        String sql = "SELECT * FROM courses";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Courses course = new Courses(
                    rs.getInt("course_id"),
                    rs.getString("course_name")
            );

            courses.add(course);
        }

        return courses;
    }
}
