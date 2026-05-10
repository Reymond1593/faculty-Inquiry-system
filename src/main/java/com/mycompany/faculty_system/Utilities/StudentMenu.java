package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import com.mycompany.faculty_system.Model.User;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class StudentMenu {

    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView, int id, User user) {

        UserComponents components = new UserComponents();

        components.addButton(
            "Search Instructor",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );
        
        components.addButton(
            "Edit Profile",
            buttonContainer,
            () -> switchView.accept(new user_edit_profile(id, user))
        );

    }
}