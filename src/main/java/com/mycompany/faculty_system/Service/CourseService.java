package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Components.ComboItem;
import com.mycompany.faculty_system.Model.Courses;
import com.mycompany.faculty_system.Model.DepartmentUI;
import com.mycompany.faculty_system.Repository.UserRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CourseService {


    // =========================
    // VIEW
    // =========================
    public static void viewCourse(Courses department) {

        JOptionPane.showMessageDialog(
                null,
                "Department ID: " + department.getId()
                + "\nDepartment Name: " + department.getName(),
                "Department Details",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // =========================
    // UPDATE
    // =========================
    public static void updateCourse(
            Courses department,
            Runnable refreshCallback
    ) throws SQLException {

        String newName = JOptionPane.showInputDialog(
                null,
                "Enter new department name:",
                department.getName()
        );

        if (newName != null && !newName.trim().isEmpty()) {

            department.setName(newName);

            refreshCallback.run();

            JOptionPane.showMessageDialog(
                    null,
                    "Department updated successfully!"
            );
            AdminService service = new AdminService();
            service.UpdateCourse(department.getId(), department.getName());
            
        }
    }

    // =========================
    // DELETE
    // =========================
    public static void deleteCourse(
            ArrayList<Courses> departmentList,
            Courses department,
            Runnable refreshCallback
    ) throws SQLException {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Delete " + department.getName() + "?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {

            departmentList.remove(department);

            refreshCallback.run();

            JOptionPane.showMessageDialog(
                    null,
                    "Department deleted successfully!"
            );
            AdminService service = new AdminService();
            service.deleteCourse(department.getId());
        }
    }

    // =========================
    // SEARCH
    // =========================
    public static ArrayList<Courses> searchCourse(
            ArrayList<Courses> departmentList,
            String keyword
    ) {

        ArrayList<Courses> filtered = new ArrayList<>();

        for (Courses department : departmentList) {

            if (department.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                filtered.add(department);
            }
        }

        return filtered;
    }
}