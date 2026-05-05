package com.mycompany.faculty_system.Utilities;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UserFrameComboBox<E> extends JComboBox<E> {

    private Color bgColor = new Color(33, 150, 243);
    private Color fgColor = Color.WHITE;

    public UserFrameComboBox(E[] items) {
        super(items);
        initStyle();
    }

    private void initStyle() {
        setPreferredSize(new Dimension(180, 32));
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setForeground(fgColor);
        setBackground(bgColor);
        setFocusable(false);

        setBorder(new EmptyBorder(5, 10, 5, 10));

        // Custom renderer (THIS makes it look modern)
        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                JLabel label = (JLabel) super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);

                label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                label.setBorder(new EmptyBorder(5, 10, 5, 10));

                if (isSelected) {
                    label.setBackground(new Color(25, 118, 210)); // hover-like
                    label.setForeground(Color.WHITE);
                } else {
                    label.setBackground(Color.WHITE);
                    label.setForeground(Color.BLACK);
                }

                return label;
            }
        });
    }
}