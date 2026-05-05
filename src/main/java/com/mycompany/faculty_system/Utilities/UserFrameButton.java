package com.mycompany.faculty_system.Utilities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class UserFrameButton extends JButton {

    private Color normalColor = new Color(33, 150, 243);
    private Color hoverColor = new Color(25, 118, 210);

    public UserFrameButton(String text) {
        super(text);
        initStyle();
    }

    private void initStyle() {
        setPreferredSize(new Dimension(180, 32));

        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(normalColor);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));

        setBorder(new RoundedBorder(15, new Color(33, 150, 243)));

        // Hover effect
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            public void mouseExited(MouseEvent e) {
                setBackground(normalColor);
            }
        });
    }
}