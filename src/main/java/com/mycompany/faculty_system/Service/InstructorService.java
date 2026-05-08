package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Components.UserDialogUI;
import com.mycompany.faculty_system.Model.Departments;
import com.mycompany.faculty_system.Model.Instructor;
import com.mycompany.faculty_system.Model.User;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InstructorService {

    // VIEW
    public static void viewInstructor(Instructor instructor) {
            UserDialogUI dialog = new UserDialogUI();
            dialog.viewHandle(instructor);
            dialog.setVisible(true);
    }

    // UPDATE
    public static void updateInstructor(Instructor instructor,Runnable refreshCallback) {
            UserDialogUI dialog = new UserDialogUI();
            dialog.updateHandle(instructor);
            dialog.setVisible(true);
    }

    // DELETE
    public static void deleteInstructor(
            ArrayList<Instructor> instructorList,
            Instructor instructor,
            Runnable refreshCallback
    ) {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Delete "
                + instructor.getName()
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
        }
    }
    public static ArrayList<Instructor> searchInstructors(
        ArrayList<Instructor> list,
        String keyword
) {

    ArrayList<Instructor> result = new ArrayList<>();

    if (keyword == null || keyword.trim().isEmpty()) {
        return list;
    }

    String key = keyword.toLowerCase().trim();

    for (Instructor i : list) {

        if (i.getName().toLowerCase().contains(key)
                || i.getEmail().toLowerCase().contains(key)
                || i.getDepartment().toLowerCase().contains(key)) {

            result.add(i);
        }
    }

    return result;
}
}