/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faculty_system;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class Faculty_system {
    public static void main(String[] args) {
        // 1. Create the outer window (JFrame)
        Login_View login_view = new Login_View();
        
        login_view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        login_view.pack();
        login_view.setLocationRelativeTo(null);
        login_view.setVisible(true);
    }
}
