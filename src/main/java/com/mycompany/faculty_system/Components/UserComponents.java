/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculty_system.Components;

import com.mycompany.faculty_system.Utilities.UserFrameButton;
import com.mycompany.faculty_system.Utilities.UserFrameComboBox;
import javax.swing.JPanel;

/**
 *
 * @author arjay
 */
public class UserComponents {
    
    public void addButton(String text, JPanel panel, Runnable action) {
        UserFrameButton btn = new UserFrameButton(text);
        btn.addActionListener(e -> action.run());
        panel.add(btn);
    }
    
    public void addCombo(String[] items, JPanel panel, java.util.function.Consumer<String> action) {

        UserFrameComboBox<String> combo = new UserFrameComboBox<>(items);

        combo.addActionListener(e -> {
            String selected = (String) combo.getSelectedItem();
            if (selected != null) {
                action.accept(selected);
            }
        });

        panel.add(combo);
    }
}
