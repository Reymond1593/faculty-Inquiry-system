package com.mycompany.faculty_system.Service;

import com.mycompany.faculty_system.Model.DepartmentUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DepartmentService {

    // =========================
    // MOCK DATA
    // =========================
    public ArrayList<DepartmentUI> getAllDepartments() {

        ArrayList<DepartmentUI> list = new ArrayList<>();

        list.add(new DepartmentUI(1, "Information Technology"));
        list.add(new DepartmentUI(2, "Computer Science"));
        list.add(new DepartmentUI(3, "Engineering"));
        list.add(new DepartmentUI(4, "Business Administration"));
        list.add(new DepartmentUI(5, "Education"));
        list.add(new DepartmentUI(6, "Hospitality Management"));
        list.add(new DepartmentUI(7, "Criminology"));
        list.add(new DepartmentUI(8, "Agriculture"));

        return list;
    }

    // =========================
    // VIEW
    // =========================
    public static void viewDepartment(DepartmentUI department) {

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
    public static void updateDepartment(
            DepartmentUI department,
            Runnable refreshCallback
    ) {

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
        }
    }

    // =========================
    // DELETE
    // =========================
    public static void deleteDepartment(
            ArrayList<DepartmentUI> departmentList,
            DepartmentUI department,
            Runnable refreshCallback
    ) {

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
        }
    }

    // =========================
    // SEARCH
    // =========================
    public static ArrayList<DepartmentUI> searchDepartments(
            ArrayList<DepartmentUI> departmentList,
            String keyword
    ) {

        ArrayList<DepartmentUI> filtered = new ArrayList<>();

        for (DepartmentUI department : departmentList) {

            if (department.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                filtered.add(department);
            }
        }

        return filtered;
    }
}