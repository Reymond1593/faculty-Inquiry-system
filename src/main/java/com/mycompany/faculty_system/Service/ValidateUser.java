/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Model.User;

/**
 *
 * @author reymo
 */
public class ValidateUser {
    
     
    public Boolean checkField(User user) {
        if(user.getFirstname().isEmpty() || user.getLastname().isEmpty() 
            || user.getEmail().isEmpty() || user.getPassword().isEmpty()
            || user.getConfirmPassword().isEmpty() || user.getRole().isEmpty()){
 
            return false;
        }
        return true;
    }

    public Boolean matchPassword(User user) {
        if(user.getPassword().equals(user.getConfirmPassword())){
            return true;
        }
        return false;
    }
}
