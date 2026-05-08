package com.mycompany.faculty_system.Utilities;

import com.mycompany.faculty_system.Admin.*;
import com.mycompany.faculty_system.Components.UserComponents;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class InstructorMenu {

    public void handle(JPanel buttonContainer, Consumer<JPanel> switchView) {

        UserComponents components = new UserComponents();

        components.addButton(
            "Dashboard",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );
//        components.addButton(
//            "Manage Students",
//            buttonContainer,
//            () -> switchView.accept(new Admin_manage_instructors(instructor))
//        );


        
        components.addButton(
            "Edit Profile",
            buttonContainer,
            () -> switchView.accept(new admin_dashboard())
        );

    }
}