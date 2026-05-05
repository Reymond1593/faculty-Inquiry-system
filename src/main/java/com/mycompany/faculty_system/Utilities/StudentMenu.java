package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class StudentMenu {

    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView) {

        UserComponents components = new UserComponents();

        components.addButton(
            "Dashboard",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );
        components.addButton(
            "Search Instructor",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );
        
        components.addButton(
            "Edit Profile",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );

    }
}