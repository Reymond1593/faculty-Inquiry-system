package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.UserUI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class getAllInstructor {
    private DbConnector connector = new DbConnector();
    
    public ArrayList<UserUI> handle() throws SQLException{
        ArrayList<UserUI> users = new ArrayList<>();

        String sql =
                "SELECT * FROM users u "
                + "JOIN roles r "
                + "ON u.role_id = r.role_id "
                + "JOIN departments d "
                + "ON u.dept_id = d.dept_id "
                + "WHERE u.role_id = 2";
        
        PreparedStatement ps = connector.database().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {

            UserUI instructor = new UserUI(
                                rs.getInt("user_id"),
                                rs.getString("first_name") + " " + rs.getString("last_name"),
                                rs.getString("email"),
                                rs.getString("dept_name")
                        );

                users.add(instructor);

            return users;
        }
        return null;
    }
}