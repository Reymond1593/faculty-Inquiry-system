/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Service;

/**
 *
 * @author reymo
 */
public class ValidateUser {
    
    private String msg;
    
    
    public Boolean validate(String email, String password, String role){
        
        
        
        if(email.isEmpty()){
            setMessage("Empty email");
            return false;
        }
        if(password.isEmpty()){
            setMessage("Empty password");
            return false;
        }
        if(role.isEmpty()){
            setMessage("Empty role");
            return false;
        }
        
        return true;
    }
    
    public void setMessage(String msg){
        this.msg = msg;
    }
    
    public String getMessage(){
        return msg;
    }
}
