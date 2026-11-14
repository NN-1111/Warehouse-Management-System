package com.warehouse;

import javax.swing.*;
import java.awt.*;

public class Dashboard {

    JFrame frame = new JFrame("Warehouse Management System");

    public Dashboard() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(225, 235, 255));

        JLabel title = CommonUI.title("DASHBOARD");

        title.setFont(new Font("Arial", Font.BOLD, 45));

        title.setBorder(
                BorderFactory.createEmptyBorder(30, 0, 10, 0)
        );

        main.add(title, BorderLayout.NORTH);

        JPanel buttons = new JPanel(
                new GridLayout(3, 2, 20, 20)
        );

        buttons.setBackground(
                new Color(225, 235, 255)
        );

        buttons.setBorder(
                BorderFactory.createEmptyBorder(
                        30, 80, 30, 80
                )
        );

        JButton add = new JButton("Add Product");
        JButton view = new JButton("View Product");
        JButton update = new JButton("Update Product");
        JButton delete = new JButton("Delete Product");
        JButton change = new JButton("Change Password");
        JButton logout = new JButton("Logout");

        buttons.add(add);
        buttons.add(view);
        buttons.add(update);
        buttons.add(delete);
        buttons.add(change);
        buttons.add(logout);

        Font font = new Font("Arial", Font.BOLD, 20);

        add.setFont(font);
        view.setFont(font);
        update.setFont(font);
        delete.setFont(font);
        change.setFont(font);
        logout.setFont(font);

        main.add(buttons, BorderLayout.CENTER);

        frame.add(main, BorderLayout.CENTER);

        frame.add(
                CommonUI.footer(),
                BorderLayout.SOUTH
        );

        add.addActionListener(e -> new AddProduct());
        view.addActionListener(e -> new ViewProduct());
        update.addActionListener(e -> new UpdateProduct());
        delete.addActionListener(e -> new DeleteProduct());
        change.addActionListener(e -> new ChangePassword());

        logout.addActionListener(e -> {
            frame.dispose();
            new Login();
        });

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }

}