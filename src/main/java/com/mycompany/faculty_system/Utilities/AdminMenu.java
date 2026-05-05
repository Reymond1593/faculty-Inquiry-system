package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class AdminMenu {

    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView) {

        UserComponents components = new UserComponents();

        components.addButton(
            "Dashboard",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );

        components.addCombo(
            new String[] { "Instructor", "Add Instructor", "Manage Instructor" },
            buttonContainer,
            selected -> {
                if (selected.equals("Add Instructor")) {
                    switchView.accept(new Admin_add_instructors());
                } else if (selected.equals("Manage Instructor")) {
                    switchView.accept(new Admin_manage_instructors());
                }
            }
        );

        components.addCombo(
            new String[] { "Student", "Add Student", "Manage Student" },
            buttonContainer,
            selected -> {
                if (selected.equals("Add Student")) {
                    switchView.accept(new Admin_add_student());
                } else if (selected.equals("Manage Student")) {
                    switchView.accept(new Admin_manage_student());
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