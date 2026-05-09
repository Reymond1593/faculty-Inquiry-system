package com.mycompany.faculty_system.Components;

import com.mycompany.faculty_system.Model.UserUI;
import com.mycompany.faculty_system.Service.InstructorService;
import java.util.ArrayList;

public class UserRow extends javax.swing.JPanel {

    public UserRow(
            UserUI instructor,
            ArrayList<UserUI> instructorList,
            Runnable refreshCallback
    ) {

        setBackground(java.awt.Color.BLACK);
        setPreferredSize(new java.awt.Dimension(750, 60));
        setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 60));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // =====================
        // NAME
        // =====================
        javax.swing.JLabel lblName =
                new javax.swing.JLabel(instructor.getName());
        lblName.setForeground(java.awt.Color.WHITE);

        add(lblName,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        // =====================
        // EMAIL
        // =====================
        javax.swing.JLabel lblEmail =
                new javax.swing.JLabel(instructor.getEmail());
        lblEmail.setForeground(java.awt.Color.WHITE);

        add(lblEmail,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 180, 40));

        // =====================
        // DEPARTMENT
        // =====================
        javax.swing.JLabel lblDept =
                new javax.swing.JLabel(instructor.getDepartment());
        lblDept.setForeground(java.awt.Color.WHITE);

        add(lblDept,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 140, 40));

        // =====================
        // ACTION PANEL (CENTER FIXED)
        // =====================
        javax.swing.JPanel actionPanel = new javax.swing.JPanel();
        actionPanel.setBackground(new java.awt.Color(240, 240, 240));
        actionPanel.setLayout(new java.awt.BorderLayout());

        // CENTER WRAPPER
        javax.swing.JPanel buttonPanel =
                new javax.swing.JPanel(
                        new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8)
                );
        buttonPanel.setBackground(new java.awt.Color(240, 240, 240));

        // =====================
        // BUTTONS
        // =====================
        javax.swing.JButton btnView = new javax.swing.JButton("View");
        javax.swing.JButton btnUpdate = new javax.swing.JButton("Update");
        javax.swing.JButton btnDelete = new javax.swing.JButton("Delete");

        btnView.setFocusable(false);
        btnUpdate.setFocusable(false);
        btnDelete.setFocusable(false);

        // =====================
        // ACTIONS
        // =====================
        btnView.addActionListener(e ->
                InstructorService.viewInstructor(instructor)
        );

        btnUpdate.addActionListener(e ->
                InstructorService.updateInstructor(instructor, refreshCallback)
        );

        btnDelete.addActionListener(e ->
                InstructorService.deleteInstructor(
                        instructorList,
                        instructor,
                        refreshCallback
                )
        );

        // =====================
        // ADD BUTTONS
        // =====================
        buttonPanel.add(btnView);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        // CENTER IT PROPERLY
        actionPanel.add(buttonPanel, java.awt.BorderLayout.CENTER);

        actionPanel.setPreferredSize(new java.awt.Dimension(260, 40));

        // =====================
        // ADD ACTION PANEL
        // =====================
        add(actionPanel,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 260, 40));
    }
}