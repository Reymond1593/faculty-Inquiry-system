/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.faculty_system;

import com.mycompany.faculty_system.Admin.Admin_add_instructors;
import com.mycompany.faculty_system.Admin.Admin_manage_instructors;
import com.mycompany.faculty_system.Admin.Departments;
import com.mycompany.faculty_system.Admin.Instructor_add_students;
import com.mycompany.faculty_system.Admin.Instructor_manage_students;
import com.mycompany.faculty_system.Admin.Student_dashboard;
import com.mycompany.faculty_system.Admin.admin_dashboard;
import com.mycompany.faculty_system.Admin.instructor_dashboard;
import com.mycompany.faculty_system.Model.User;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author reymo
 */
public class instructor_view extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(instructor_view.class.getName());

    /**
     * Creates new form Admin_view
     */
    public instructor_view() {
        initComponents();
        
        instructor_dashboard dashboard = new instructor_dashboard();
        instructor_views.setLayout(new java.awt.BorderLayout());
        instructor_views.add(dashboard, java.awt.BorderLayout.CENTER);

        instructor_views.revalidate();
        instructor_views.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        students = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        instructor_views = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel4.setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Dashboard");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 32));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Logout");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 32));

        jButton6.setBackground(new java.awt.Color(0, 0, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Dashboard");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 32));

        jButton7.setBackground(new java.awt.Color(0, 0, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Edit profile");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 32));

        students.setBackground(new java.awt.Color(0, 0, 102));
        students.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        students.setForeground(new java.awt.Color(255, 255, 255));
        students.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "-Add Students", "-Manage Students" }));
        students.addActionListener(this::studentsActionPerformed);
        jPanel2.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Instructor user");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 30));

        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role.setText("Instructor");
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, -1));

        jPanel4.add(jPanel2);

        instructor_views.setBackground(new java.awt.Color(255, 255, 255));
        instructor_views.setPreferredSize(new java.awt.Dimension(600, 500));
        instructor_views.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(instructor_views);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
        instructor_views.removeAll();

        instructor_dashboard dashboard = new instructor_dashboard();
        instructor_views.setLayout(new java.awt.BorderLayout());
        instructor_views.add(dashboard, java.awt.BorderLayout.CENTER);

        instructor_views.revalidate();
        instructor_views.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login_View login_view = new Login_View();
        login_view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        login_view.pack();
        login_view.setLocationRelativeTo(null);
        login_view.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton7ActionPerformed

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        // TODO add your handling code here:
        String selected = students.getSelectedItem().toString();

        instructor_views.removeAll();

        if (selected.equals("-Add Students")) {
            Instructor_add_students add = new Instructor_add_students(); // your panel
            instructor_views.setLayout(new java.awt.BorderLayout());
            instructor_views.add(add, java.awt.BorderLayout.CENTER);
        }
        if (selected.equals("-Manage Students")) {
            Instructor_manage_students manage = new Instructor_manage_students();
            instructor_views.setLayout(new java.awt.BorderLayout());
            instructor_views.add(manage, java.awt.BorderLayout.CENTER);
        }

        instructor_views.revalidate();
        instructor_views.repaint();
    }//GEN-LAST:event_studentsActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new instructor_view().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel instructor_views;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> students;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

//    void setProfile(User dbUser) {
//        role.setText(dbUser.getRole());
//        username.setText(dbUser.getFirstname() + " " + dbUser.getLastname());
//    }
}
