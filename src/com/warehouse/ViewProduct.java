package com.warehouse;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class ViewProduct {

    JFrame frame = new JFrame("Warehouse Management System");

    public ViewProduct() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(225, 235, 255));

        JLabel title = CommonUI.title("VIEW PRODUCT");
        title.setFont(new Font("Arial", Font.BOLD, 45));
        title.setBorder(
                BorderFactory.createEmptyBorder(25, 0, 15, 0)
        );

        main.add(title, BorderLayout.NORTH);

        String[] columns = {
                "Product ID",
                "Product Name",
                "Category",
                "Quantity",
                "Price"
        };

        JTable table = new JTable(
                new Object[][] {},
                columns
        );

        table.setFont(new Font("Arial", Font.BOLD, 18));
        table.setRowHeight(35);

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 18));

        main.add(
                new JScrollPane(table),
                BorderLayout.CENTER
        );

        JPanel buttons = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 25, 10)
        );

        JButton refresh = new JButton("Refresh");
        JButton back = new JButton("Back");

        Font font = new Font(
                "Arial", Font.BOLD, 18);

        refresh.setFont(font);
        back.setFont(font);

        refresh.setPreferredSize(
                new Dimension(130, 45));

        back.setPreferredSize(
                new Dimension(130, 45));

        buttons.add(refresh);
        buttons.add(back);

        main.add(buttons, BorderLayout.SOUTH);

        frame.add(main, BorderLayout.CENTER);
        frame.add(CommonUI.footer(), BorderLayout.SOUTH);

        back.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewProduct();
    }
}
