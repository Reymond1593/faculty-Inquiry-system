/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arjay
 */
public class Student {
    private String name;
    private String email;
    private String courses;

    public Student(
            String name,
            String email,
            String courses
    ) {

        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
