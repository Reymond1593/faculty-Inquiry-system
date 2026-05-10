package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Components.UserDialogUI;
import com.mycompany.faculty_system.Model.Departments;
import com.mycompany.faculty_system.Model.UserUI;
import com.mycompany.faculty_system.Model.User;
import com.mycompany.faculty_system.Repository.UserRepository;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InstructorService {

    // VIEW
    public static void viewInstructor(UserUI instructor) {
            UserDialogUI dialog = new UserDialogUI();
            dialog.viewHandle(instructor);
            dialog.setVisible(true);
    }

    // UPDATE
    public static void updateInstructor(UserUI instructor,Runnable refreshCallback) {
            UserDialogUI dialog = new UserDialogUI();
            dialog.updateHandle(instructor,refreshCallback);
            refreshCallback.run();
            dialog.setVisible(true);
    }

    // DELETE
    public static void deleteInstructor(
            ArrayList<UserUI> instructorList,
            UserUI instructor,
            Runnable refreshCallback
    ) throws SQLException {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Delete "
                + instructor.getFirstName() + " " + instructor.getLastName()
                + "?",
                "Delete Instructor",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {

            // REMOVE OBJECT
            instructorList.remove(instructor);

            // REFRESH UI
            refreshCallback.run();

            JOptionPane.showMessageDialog(
                    null,
                    "Instructor Deleted Successfully!"
            );
            UserRepository repo = new UserRepository();
            repo.deleteUser(instructor.getId());
        }
    }
    public static ArrayList<UserUI> searchInstructors(
        ArrayList<UserUI> list,
        String keyword
) {

    ArrayList<UserUI> result = new ArrayList<>();

    if (keyword == null || keyword.trim().isEmpty()) {
        return list;
    }

    String key = keyword.toLowerCase().trim();

    for (UserUI i : list) {

        if (i.getFirstName().toLowerCase().contains(key)
                || i.getEmail().toLowerCase().contains(key)
                || i.getDepartment().toLowerCase().contains(key)) {

            result.add(i);
        }
    }

    return result;
}
}