package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Model.Courses;
import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Model.Departments;
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
    public ArrayList<DepartmentUI> getDepartmentsList() throws SQLException{
        UserRepository repo = new UserRepository();
        return repo.getDepartmentList();
    }
    public ArrayList<Courses> getCouresList() throws SQLException{
        UserRepository repo = new UserRepository();
        return repo.getCourseList();
    }

    public void updateUser(String user_firstName, String user_lastName, String user_email, int userId, Runnable refreshCallback) throws SQLException {
        User user = new User();
        user.setFirstname(user_firstName);
        user.setLastname(user_lastName);
        user.setEmail(user_email);
        
        UserRepository repo = new UserRepository();
        repo.updateUser(user, userId);
    }
    public void updateDepartment(int deptId, String deptName) throws SQLException{
        UserRepository repo = new UserRepository();
        repo.updateDepartment(deptId, deptName);
    }
    public void UpdateCourse(int id, String name) throws SQLException {
        UserRepository repo = new UserRepository();
        repo.updateCourse(id, name);
    }
    
    public void addDepartments(String name) throws SQLException{
        UserRepository repo = new UserRepository();
        repo.addDepartments(name);
    }
    public void addCourses(String name) throws SQLException{
        UserRepository repo = new UserRepository();
        repo.addCourse(name);
    }
    
    public void deleteDepartments(int deptId) throws SQLException{
        UserRepository repo = new UserRepository();
        repo.deleteDepartment(deptId);
    }
    public void deleteCourse(int deptId) throws SQLException{
        UserRepository repo = new UserRepository();
        repo.deleteCourse(deptId);
    }

}
