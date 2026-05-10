package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Connection.DbConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getDepartmentCount {

    private DbConnector connector = new DbConnector();

    public int getCount() {

        int count = 0;

        try {

            String sql = "SELECT COUNT(*) AS total FROM departments";

            PreparedStatement ps = connector.database().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt("total");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}