package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Courses;
import com.mycompany.faculty_system.Model.Departments;
import com.mycompany.faculty_system.Utilities.Alert;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addCourse {

    private final DbConnector connector = new DbConnector();

    public void handle(Courses course) throws SQLException {

        String sql = "INSERT INTO courses (course_name) VALUES (?)";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ps.setString(1, course.getName());

        ps.executeUpdate();

        Alert.showSuccess("Course successfully added");
    }
}