package com.mycompany.faculty_system.Components;


import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Service.DepartmentService;
import java.util.ArrayList;

public class DepartmentsRow extends javax.swing.JPanel {

    public DepartmentsRow(
            DepartmentUI department, ArrayList<DepartmentUI> departmentList, Runnable refreshCallback) {

        setBackground(java.awt.Color.BLACK);
        setPreferredSize(new java.awt.Dimension(750, 60));
        setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 60));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // =====================
        // ID
        // =====================
        javax.swing.JLabel lblId =
                new javax.swing.JLabel(String.valueOf(department.getId()));

        lblId.setForeground(java.awt.Color.WHITE);

        add(lblId,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        // =====================
        // NAME
        // =====================
        javax.swing.JLabel lblName =
                new javax.swing.JLabel(department.getName());

        lblName.setForeground(java.awt.Color.WHITE);

        add(lblName,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 180, 40));

        // =====================
        // ACTION PANEL
        // =====================
        javax.swing.JPanel actionPanel = new javax.swing.JPanel();
        actionPanel.setBackground(new java.awt.Color(240, 240, 240));
        actionPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.JPanel buttonPanel =
                new javax.swing.JPanel(
                        new java.awt.FlowLayout(
                                java.awt.FlowLayout.CENTER,
                                8,
                                8
                        )
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
                DepartmentService.viewDepartment(department)
        );

        btnUpdate.addActionListener(e ->
                DepartmentService.updateDepartment(
                        department,
                        refreshCallback
                )
        );

        btnDelete.addActionListener(e ->
                DepartmentService.deleteDepartment(
                        departmentList,
                        department,
                        refreshCallback
                )
        );

        // =====================
        // ADD BUTTONS
        // =====================
        buttonPanel.add(btnView);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        actionPanel.add(buttonPanel, java.awt.BorderLayout.CENTER);

        // =====================
        // ADD ACTION PANEL
        // =====================
        add(actionPanel,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(
                        520,
                        10,
                        250,
                        40
                ));
    }
}