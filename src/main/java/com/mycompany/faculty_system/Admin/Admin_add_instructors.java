package com.mycompany.faculty_system.Admin;

public class Admin_add_instructors extends javax.swing.JPanel {

    public Admin_add_instructors() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        title = new javax.swing.JLabel();

        lblFirst = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();

        lblLast = new javax.swing.JLabel();
        txtLast = new javax.swing.JTextField();

        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        lblDept = new javax.swing.JLabel();
        cmbDept = new javax.swing.JComboBox<>();

        empPanel = new javax.swing.JPanel();
        lblEmp = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 1));

        mainPanel.setBackground(new java.awt.Color(245, 245, 250));
        mainPanel.setLayout(null);

        // TITLE
        title.setText("Add Instructor");
        title.setFont(new java.awt.Font("Segoe UI", 1, 22));
        mainPanel.add(title);
        title.setBounds(150, 20, 250, 40);

        // FIRST NAME
        lblFirst.setText("First Name");
        mainPanel.add(lblFirst);
        lblFirst.setBounds(40, 90, 200, 20);

        mainPanel.add(txtFirst);
        txtFirst.setBounds(40, 110, 450, 40);

        // LAST NAME
        lblLast.setText("Last Name");
        mainPanel.add(lblLast);
        lblLast.setBounds(40, 170, 200, 20);

        mainPanel.add(txtLast);
        txtLast.setBounds(40, 190, 450, 40);

        // EMAIL
        lblEmail.setText("E-Mail");
        mainPanel.add(lblEmail);
        lblEmail.setBounds(40, 250, 200, 20);

        mainPanel.add(txtEmail);
        txtEmail.setBounds(40, 270, 450, 40);

        // DEPARTMENT
        lblDept.setText("Department");
        mainPanel.add(lblDept);
        lblDept.setBounds(40, 330, 200, 20);

        cmbDept.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"Select Department", "SoIT", "SoED", "SoAS"}
        ));
        mainPanel.add(cmbDept);
        cmbDept.setBounds(40, 350, 450, 40);

        // EMPLOYMENT PANEL
        empPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        empPanel.setLayout(null);

        lblEmp.setText("Employment Details");
        empPanel.add(lblEmp);
        lblEmp.setBounds(10, 10, 200, 20);

        role.setText("Role: Senior Faculty");
        empPanel.add(role);
        role.setBounds(20, 50, 200, 20);

        date.setText("Join Date: TBD");
        empPanel.add(date);
        date.setBounds(240, 50, 200, 20);

        mainPanel.add(empPanel);
        empPanel.setBounds(40, 420, 450, 120);

        // BUTTONS
        btnCancel.setText("Cancel");
        mainPanel.add(btnCancel);
        btnCancel.setBounds(40, 570, 150, 40);

        btnSave.setText("Save Instructor");
        btnSave.setBackground(new java.awt.Color(10, 10, 30));
        btnSave.setForeground(java.awt.Color.WHITE);
        btnSave.setFocusPainted(false);

        mainPanel.add(btnSave);
        btnSave.setBounds(250, 570, 240, 40);

        add(mainPanel);
    }

    // Variables
    private javax.swing.JPanel mainPanel;

    private javax.swing.JLabel title;

    private javax.swing.JLabel lblFirst;
    private javax.swing.JTextField txtFirst;

    private javax.swing.JLabel lblLast;
    private javax.swing.JTextField txtLast;

    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField txtEmail;

    private javax.swing.JLabel lblDept;
    private javax.swing.JComboBox<String> cmbDept;

    private javax.swing.JPanel empPanel;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel role;
    private javax.swing.JLabel date;

    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
}
