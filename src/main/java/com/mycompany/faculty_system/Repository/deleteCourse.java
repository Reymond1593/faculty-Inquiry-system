package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteCourse {

    private final DbConnector connector = new DbConnector();

    public void handle(int deptId) throws SQLException {

        String sql = "DELETE FROM courses WHERE course_id = ?";

        PreparedStatement ps = connector.database().prepareStatement(sql);

        ps.setInt(1, deptId);

        ps.executeUpdate();
    }
}