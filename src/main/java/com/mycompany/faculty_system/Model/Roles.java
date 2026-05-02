/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Model;

/**
 *
 * @author arjay
 */
public class Roles {
    private int id;
    
    public void setId(String id){
        if(id.equals("Student")){
            this.id = 3;
        }
        if(id.equals("Instructor")){
            this.id = 2;
        }
    }
    public int getId(){
        return id;
    }
}
