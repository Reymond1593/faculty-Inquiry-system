package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Model.UserUI;
import com.mycompany.faculty_system.Repository.UserRepository;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminService {
    
    public ArrayList<UserUI> getInstructorList() throws SQLException{
        UserRepository repo = new UserRepository();
        
        return repo.getInstructorList();
    }
    public ArrayList<UserUI> getStudentsList() throws SQLException{
        UserRepository repo = new UserRepository();
        
        return repo.getStudentsList();
    }

    public void updateUser(String user_firstName, String user_lastName, String user_email, int userId) throws SQLException {
        User user = new User();
        user.setFirstname(user_firstName);
        user.setLastname(user_lastName);
        user.setEmail(user_email);
        
        UserRepository repo = new UserRepository();
        repo.updateUser(user, userId);
    }
}
