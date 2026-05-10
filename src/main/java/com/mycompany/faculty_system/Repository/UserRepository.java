/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Repository;

import com.mycompany.faculty_system.Components.ComboItem;
import com.mycompany.faculty_system.Connection.DbConnector;
import com.mycompany.faculty_system.Model.Courses;
import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Model.Departments;
import com.mycompany.faculty_system.Model.UserUI;
import com.mycompany.faculty_system.Model.Roles;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Service.ValidateUser;
import com.mycompany.faculty_system.Utilities.Alert;
import com.mycompany.faculty_system.Utilities.PasswordUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author arjay
 */
public class UserRepository {
    
    public void addInstructor(String user_firstName, String user_lastName, String user_email, String user_password, ComboItem selectedItem, int roleId) throws SQLException {
        User user = new User();
        Departments newDepartments = new Departments();
        Roles role = new Roles();
        newDepartments.setId(selectedItem.getId());
        newDepartments.setName(selectedItem.getName());
        role.setId(roleId);
        
        user.setFirstname(user_firstName);
        user.setLastname(user_lastName);
        user.setEmail(user_email);
        user.setPassword(user_password);
        user.setDepartments(newDepartments);
        user.setRoles(role);
        addInstructor add = new addInstructor();
        add.handle(user);
    }
    
    public void addStudent(String user_firstName, String user_lastName, String user_email, String user_password, ComboItem selectedItem, int roleId) throws SQLException {
        User user = new User();
        Courses newCourses = new Courses();
        Roles roles = new Roles();
        newCourses.setId(selectedItem.getId());
        newCourses.setName(selectedItem.getName());
        roles.setId(roleId);
        
        user.setFirstname(user_firstName);
        user.setLastname(user_lastName);
        user.setEmail(user_email);
        user.setPassword(user_password);
        user.setCourses(newCourses);
        user.setRoles(roles);

        addStudent add = new addStudent();
        add.handle(user);
    }

    public User getUser(String email,  String password) throws SQLException {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        getUserByEmail_Password get = new getUserByEmail_Password();
        
        return get.handle(user);
    }
    public ArrayList<UserUI> getInstructorList() throws SQLException{
        getAllInstructor getAll = new getAllInstructor();
        return getAll.handle();
    }
    public ArrayList<UserUI> getStudentsList() throws SQLException{
        getAllStudents getAll = new getAllStudents();
        return getAll.handle();
    }
    public ArrayList<Courses> getCourseList() throws SQLException{
        getAllCoures getAll = new getAllCoures();
        return getAll.handle();
    }
    public ArrayList<DepartmentUI> getDepartmentList() throws SQLException{
        getAllDepartments getAll = new getAllDepartments();
        return getAll.handle();
    }
    
    public void updateUser(User user, int userId) throws SQLException {
        updateUser update = new updateUser();
        update.handle(user, userId);
    }
    public void updateDepartment(int deptId, String deptName) throws SQLException {
        updateDepartment update = new updateDepartment();
        update.handle(deptId, deptName);
    }
    public void updateCourse(int id, String name) throws SQLException {
        updateCourse update = new updateCourse();
        update.handle(id, name);
    }
    public void deleteUser(int userId) throws SQLException {
        deleteUser delete = new deleteUser();
        delete.handle(userId);
    }
    public void deleteDepartment(int deptId) throws SQLException {
        deleteDepartment delete = new deleteDepartment();
        delete.handle(deptId);
    }
    public void deleteCourse(int deptId) throws SQLException {
        deleteCourse delete = new deleteCourse();
        delete.handle(deptId);
    }
        
    public void addDepartments(String name) throws SQLException{
        Departments departments = new Departments();
        departments.setName(name);
        
        addDepartments add = new addDepartments();
        add.handle(departments);
    }
    public void addCourse(String name) throws SQLException{
        Courses course = new Courses();
        course.setName(name);
        
        addCourse add = new addCourse();
        add.handle(course);
    }

    
}
