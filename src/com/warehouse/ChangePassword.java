package com.warehouse;

import javax.swing.*;
import java.awt.*;

public class ChangePassword {

    JFrame frame = new JFrame("Warehouse Management System");

    public ChangePassword() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(225, 235, 255));

        JLabel title = CommonUI.title("CHANGE PASSWORD");
        title.setFont(new Font("Arial", Font.BOLD, 45));
        title.setBorder(
                BorderFactory.createEmptyBorder(25, 0, 10, 0));

        main.add(title, BorderLayout.NORTH);

        JPanel form = new JPanel(
                new GridLayout(3, 2, 15, 15));

        form.setPreferredSize(
                new Dimension(650, 230));

        form.setBackground(
                new Color(225, 235, 255));

        JLabel oldL = new JLabel("Old Password");
        JLabel newL = new JLabel("New Password");
        JLabel confirmL = new JLabel("Confirm Password");

        JPasswordField oldPass = new JPasswordField();
        JPasswordField newPass = new JPasswordField();
        JPasswordField confirm = new JPasswordField();

        Font font = new Font(
                "Arial", Font.BOLD, 22);

        oldL.setFont(font);
        newL.setFont(font);
        confirmL.setFont(font);

        oldPass.setFont(font);
        newPass.setFont(font);
        confirm.setFont(font);

        form.add(oldL);
        form.add(oldPass);
        form.add(newL);
        form.add(newPass);
        form.add(confirmL);
        form.add(confirm);

        JPanel center = new JPanel(
                new GridBagLayout());

        center.setBackground(
                new Color(225, 235, 255));

        center.add(form);

        main.add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 25, 10));

        JButton save = new JButton("Save");
        JButton reset = new JButton("Reset");
        JButton back = new JButton("Back");

        save.setFont(font);
        reset.setFont(font);
        back.setFont(font);

        save.setPreferredSize(
                new Dimension(130, 45));
        reset.setPreferredSize(
                new Dimension(130, 45));
        back.setPreferredSize(
                new Dimension(130, 45));

        buttons.add(save);
        buttons.add(reset);
        buttons.add(back);

        main.add(buttons, BorderLayout.SOUTH);

        frame.add(main, BorderLayout.CENTER);
        frame.add(CommonUI.footer(), BorderLayout.SOUTH);

        save.addActionListener(e -> {

            String old = String.valueOf(
                    oldPass.getPassword());

            String password = String.valueOf(
                    newPass.getPassword());

            String confirmPassword = String.valueOf(
                    confirm.getPassword());

            if (old.isEmpty() ||
                    password.isEmpty() ||
                    confirmPassword.isEmpty()) {

                JOptionPane.showMessageDialog(
                        frame, "Fill all fields");

            } else if (!password.equals(confirmPassword)) {

                JOptionPane.showMessageDialog(
                        frame, "Passwords do not match");

            } else {

                JOptionPane.showMessageDialog(
                        frame, "Password Changed");
            }
        });

        reset.addActionListener(e -> {
            oldPass.setText("");
            newPass.setText("");
            confirm.setText("");
        });

        back.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ChangePassword();
    }
}
