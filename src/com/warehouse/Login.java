package com.warehouse;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login {

    JFrame frame = new JFrame("Warehouse Management System");

    public Login() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new GridBagLayout());
        main.setBackground(new Color(225, 235, 255));

        JPanel box = new JPanel(new GridBagLayout());
        box.setPreferredSize(new Dimension(480, 300));
        box.setBorder(new LineBorder(Color.GRAY, 2));

        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(10, 15, 10, 15);

        JLabel title = new JLabel("WAREHOUSE LOGIN");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(new Color(0, 70, 140));

        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 2;
        box.add(title, g);
        g.insets = new Insets(25, 12, 25, 12);

        Font font = new Font("Arial", Font.BOLD, 18);

        g.gridwidth = 1;
        g.gridy = 1;
        g.gridx = 0;

        JLabel u = new JLabel("Username");
        u.setFont(font);
        box.add(u, g);

        JTextField user = new JTextField(15);
        user.setFont(font);
        g.gridx = 1;
        box.add(user, g);

        g.gridy = 2;
        g.gridx = 0;

        JLabel p = new JLabel("Password");
        p.setFont(font);
        box.add(p, g);

        JPasswordField pass = new JPasswordField(15);
        pass.setFont(font);
        g.gridx = 1;
        box.add(pass, g);

        JButton login = new JButton("Login");
        JButton reset = new JButton("Reset");

        login.setFont(font);
        reset.setFont(font);

        JPanel buttons = new JPanel();
        buttons.add(login);
        buttons.add(reset);

        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 2;
        g.insets = new Insets(30, 10, 10, 10);
        box.add(buttons, g);

        main.add(box);

        frame.add(main, BorderLayout.CENTER);
        frame.add(CommonUI.footer(), BorderLayout.SOUTH);

        login.addActionListener(e -> {
            if (user.getText().equals("naman")
                    && String.valueOf(pass.getPassword()).equals("1234")) {

                JOptionPane.showMessageDialog(
                        frame, "Login Successful");

                frame.dispose();
                new Dashboard();

            } else {
                JOptionPane.showMessageDialog(
                        frame, "Invalid Username or Password");
            }
        });

        reset.addActionListener(e -> {
            user.setText("");
            pass.setText("");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new Login();
    }
}
