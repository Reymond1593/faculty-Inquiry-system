/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Utilities;

import javax.swing.JOptionPane;

/**
 *
 * @author arjay
 */
public class Alert {
    public static void showError(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Validation Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
    public static void showSuccess(String message) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Success",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
