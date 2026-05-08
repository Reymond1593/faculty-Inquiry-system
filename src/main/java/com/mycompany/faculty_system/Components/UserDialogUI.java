/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Components;

import com.mycompany.faculty_system.Admin.UpdateUserPanel;
import com.mycompany.faculty_system.Admin.ViewUserPanel;
import com.mycompany.faculty_system.Model.Instructor;
import com.mycompany.faculty_system.Model.User;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class UserDialogUI extends JDialog {
    
    public void viewHandle(Instructor instructor){
        
        setTitle("Instructor Details");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setModal(true);

        ViewUserPanel panel = new ViewUserPanel();
        panel.setViewUser(instructor);
        
        setLayout(new java.awt.BorderLayout()); // IMPORTANT
        add(panel, java.awt.BorderLayout.CENTER);
    }
    public void updateHandle(Instructor instructor){
        
        setTitle("Instructor Details");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setModal(true);

        UpdateUserPanel panel = new UpdateUserPanel();
        panel.setUpdateUser(instructor);
        
        setLayout(new java.awt.BorderLayout()); // IMPORTANT
        add(panel, java.awt.BorderLayout.CENTER);
    }
}
