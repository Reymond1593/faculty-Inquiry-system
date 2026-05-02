/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Model;

/**
 *
 * @author arjay
 */
public class User {
    
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String confirmPassword;
    private String role;

    public void setId(int id){
        this.id = id;
    }
    
    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId(){
        return id;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }
    
}
