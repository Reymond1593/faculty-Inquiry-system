package com.mycompany.faculty_system;

import javax.swing.JFrame;


public class Faculty_system {
    public static void main(String[] args){
        //UserFrame role = new UserFrame();
        UserLogin role = new UserLogin();
        role.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        role.pack();
        role.setLocationRelativeTo(null);
        role.setVisible(true);
    }
}
