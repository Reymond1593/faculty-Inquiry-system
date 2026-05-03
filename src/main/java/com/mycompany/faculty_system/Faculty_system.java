/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faculty_system;

import javax.swing.JFrame;


public class Faculty_system {
    public static void main(String[] args){
        Admin_view role = new Admin_view();
        //UserRole role = new UserRole();
        role.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        role.pack();
        role.setLocationRelativeTo(null);
        role.setVisible(true);
    }
}
