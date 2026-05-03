package com.mycompany.faculty_system.Model;


public class User {
    
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Departments departments;
    private Courses courses;
    private Roles roles;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = id;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { 
        if(firstname.isEmpty()){
            throw new IllegalArgumentException("first name is empty");
        }
        this.firstname = firstname; 
    }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { 
        if(lastname.isEmpty()){
            throw new IllegalArgumentException("last name is empty");
        }
        this.lastname = lastname; 
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { 
        if(email.isEmpty()){
            throw new IllegalArgumentException("email is empty");
        }
        this.email = email; 
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { 
        if(password.isEmpty()){
            throw new IllegalArgumentException("password is empty");
        }
        this.password = password; 
    }

    public Roles getRoles() { return roles; }
    public void setRoles(Roles roles) { this.roles = roles; }

    public Departments getDepartments() { return departments; }
    public void setDepartments(Departments departments) { this.departments = departments; }

    public Courses getCourses() { return courses; }
    public void setCourses(Courses courses) { this.courses = courses; }

}