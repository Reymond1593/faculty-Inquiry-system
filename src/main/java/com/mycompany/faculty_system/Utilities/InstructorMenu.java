package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import com.mycompany.faculty_system.Instructor.EditProfile;
import com.mycompany.faculty_system.Model.User;
import java.sql.SQLException;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class InstructorMenu {

    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView, int id, User user) {

        UserComponents components = new UserComponents();

        components.addButton(
            "Manage Students",
            buttonContainer,
            () -> {
            try {
                switchView.accept(new Admin_manage_students());
            } catch (SQLException ex) {
                System.getLogger(InstructorMenu.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        );
        
        components.addButton(
            "Edit Profile",
            buttonContainer,
            () -> switchView.accept(new user_edit_profile(id, user))
        );

    }
}