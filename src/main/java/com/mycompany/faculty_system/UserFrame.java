/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.faculty_system;

import com.mycompany.faculty_system.Admin.Admin_add_departments;
import com.mycompany.faculty_system.Admin.Admin_manage_instructors;
import com.mycompany.faculty_system.Student.Student_dashboard;
import com.mycompany.faculty_system.Admin.admin_dashboard;
import com.mycompany.faculty_system.Instructor.Instructor_manage_students;
import com.mycompany.faculty_system.Components.UserComponents;
import com.mycompany.faculty_system.Model.Roles;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Utilities.AdminMenu;
import com.mycompany.faculty_system.Utilities.InstructorMenu;
import com.mycompany.faculty_system.Utilities.StudentMenu;
import com.mycompany.faculty_system.Utilities.UserFrameButton;
import com.mycompany.faculty_system.Utilities.UserFrameComboBox;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author reymo
 */
public class UserFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserFrame.class.getName());
    private User user;
    public UserFrame() {
        initComponents();
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(sidebar, java.awt.BorderLayout.WEST);
        jPanel4.add(userViews, java.awt.BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        UserButtonContainer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        userViews = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1140, 500));

        sidebar.setBackground(new java.awt.Color(0, 0, 102));
        sidebar.setPreferredSize(new java.awt.Dimension(300, 500));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        sidebar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Admin User");
        sidebar.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 30));

        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText("Administrator");
        sidebar.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        UserButtonContainer.setBackground(new java.awt.Color(51, 51, 255));
        sidebar.add(UserButtonContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 270));

        jButton1.setText("Logout");
        sidebar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        userViews.setBackground(new java.awt.Color(255, 255, 255));
        userViews.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(userViews, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userViews, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserButtonContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel role;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel userViews;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables


    private void switchView(JPanel panel) {
        userViews.removeAll();
        userViews.setLayout(new java.awt.BorderLayout());
        userViews.add(panel, java.awt.BorderLayout.CENTER);
        userViews.revalidate();
        userViews.repaint();
    }
    public void setUser(User user){
        this.user = user;
    }
    public void configureUser(String userRole) throws SQLException {

        switch (userRole) {
            case "Admin" -> {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.handle(UserButtonContainer, this::switchView, user);
            }

            case "Instructor" -> {
                InstructorMenu instructorMenu = new InstructorMenu();
                instructorMenu.handle(UserButtonContainer, this::switchView);
            }
            
            case "Student" -> {
                StudentMenu studentMenu = new StudentMenu();
                studentMenu.handle(UserButtonContainer, this::switchView);
            }
        }

    }

    public void setProfile(User dbUser) {
        //
    }

}
