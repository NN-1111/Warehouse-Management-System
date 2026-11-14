package com.warehouse;

import javax.swing.*;
import java.awt.*;

public class DeleteProduct {

    JFrame frame = new JFrame("Warehouse Management System");

    public DeleteProduct() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(225, 235, 255));

        JLabel title = CommonUI.title("DELETE PRODUCT");
        title.setFont(new Font("Arial", Font.BOLD, 45));
        title.setBorder(
                BorderFactory.createEmptyBorder(25, 0, 10, 0));

        main.add(title, BorderLayout.NORTH);

        JPanel form = new JPanel(
                new GridLayout(1, 2, 15, 15));

        form.setPreferredSize(
                new Dimension(500, 100));

        form.setBackground(
                new Color(225, 235, 255));

        JLabel idL = new JLabel("Product ID");
        JTextField id = new JTextField();

        Font font = new Font(
                "Arial", Font.BOLD, 22);

        idL.setFont(font);
        id.setFont(font);

        form.add(idL);
        form.add(id);

        JPanel center = new JPanel(
                new GridBagLayout());

        center.setBackground(
                new Color(225, 235, 255));

        center.add(form);

        main.add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 25, 10));

        JButton delete = new JButton("Delete");
        JButton reset = new JButton("Reset");
        JButton back = new JButton("Back");

        delete.setFont(font);
        reset.setFont(font);
        back.setFont(font);

        delete.setPreferredSize(
                new Dimension(130, 45));
        reset.setPreferredSize(
                new Dimension(130, 45));
        back.setPreferredSize(
                new Dimension(130, 45));

        buttons.add(delete);
        buttons.add(reset);
        buttons.add(back);

        main.add(buttons, BorderLayout.SOUTH);

        frame.add(main, BorderLayout.CENTER);
        frame.add(CommonUI.footer(), BorderLayout.SOUTH);

        delete.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    frame, "Product Deleted");
            id.setText("");
        });

        reset.addActionListener(e ->
                id.setText(""));

        back.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DeleteProduct();
    }
}