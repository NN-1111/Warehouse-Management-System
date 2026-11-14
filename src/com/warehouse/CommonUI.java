package com.warehouse;

import javax.swing.*;
import java.awt.*;

public class CommonUI {

    public static JLabel title(String text) {
        JLabel l = new JLabel(text, SwingConstants.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 32));
        l.setForeground(new Color(0, 70, 140));
        return l;
    }

    public static JPanel footer() {
        JPanel p = new JPanel(new GridLayout(2, 1));
        p.setBackground(new Color(0, 70, 140));
        p.setPreferredSize(new Dimension(0, 70));

        JLabel a = new JLabel(
                "Developed By : NAMAN GUPTA",
                SwingConstants.CENTER);

        JLabel b = new JLabel(
                "Reg.ID : PIET25CS099",
                SwingConstants.CENTER);

        a.setForeground(Color.WHITE);
        b.setForeground(Color.WHITE);
        a.setFont(new Font("Arial", Font.BOLD, 18));
        b.setFont(new Font("Arial", Font.BOLD, 18));


        p.add(a);
        p.add(b);

        return p;
    }

    public static JLabel logo() {
        ImageIcon i = new ImageIcon(
                "src/images/collegelogo.png");

        Image img = i.getImage().getScaledInstance(
                880, 140, Image.SCALE_SMOOTH);

        return new JLabel(
                new ImageIcon(img),
                SwingConstants.CENTER);
    }
}
