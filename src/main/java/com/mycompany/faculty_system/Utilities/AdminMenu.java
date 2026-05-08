package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import com.mycompany.faculty_system.Model.UserUI;
import com.mycompany.faculty_system.Model.User;
import java.sql.SQLException;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class AdminMenu {
    
    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView, User user) throws SQLException{
        
        UserComponents components = new UserComponents();
        
        components.addButton(
            "Dashboard",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );
        components.addButton(
            "Manage Instructor",
            buttonContainer,
            () -> {
            try {
                switchView.accept(new Admin_manage_instructors());
            } catch (SQLException ex) {
                System.getLogger(AdminMenu.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        );
        components.addButton(
            "Manage Students",
            buttonContainer,
            () -> {
            try {
                switchView.accept(new Admin_manage_students());
            } catch (SQLException ex) {
                System.getLogger(AdminMenu.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        );

        components.addCombo(
            new String[] { "Departments", "Add Departments", "Manage Departments" },
            buttonContainer,
            selected -> {
                if (selected.equals("Add Departments")) {
                    switchView.accept(new Admin_add_departments());
                }
            }
        );

        components.addCombo(
            new String[] { "Courses", "Add Courses", "Manage Courses" },
            buttonContainer,
            selected -> System.out.println(selected)
        );
    }
}