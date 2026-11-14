package com.warehouse;

import javax.swing.*;
import java.awt.*;

public class AddProduct {

    JFrame frame = new JFrame("Warehouse Management System");

    public AddProduct() {

        frame.setSize(900, 650);
        frame.setMinimumSize(new Dimension(700, 550));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(CommonUI.logo(), BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(225, 235, 255));

        JLabel title = CommonUI.title("ADD PRODUCT");
        title.setFont(new Font("Arial", Font.BOLD, 45));
        title.setBorder(
                BorderFactory.createEmptyBorder(25, 0, 20, 0));

        main.add(title, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(5, 2, 15, 12));
        form.setPreferredSize(new Dimension(660, 260));
        form.setBackground(new Color(225, 235, 255));

        JLabel idL = new JLabel("Product ID");
        JLabel nameL = new JLabel("Product Name");
        JLabel catL = new JLabel("Category");
        JLabel qtyL = new JLabel("Quantity");
        JLabel priceL = new JLabel("Price");

        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField cat = new JTextField();
        JTextField qty = new JTextField();
        JTextField price = new JTextField();

        Font font = new Font("Arial", Font.BOLD, 22);

        idL.setFont(font);
        nameL.setFont(font);
        catL.setFont(font);
        qtyL.setFont(font);
        priceL.setFont(font);

        id.setFont(font);
        name.setFont(font);
        cat.setFont(font);
        qty.setFont(font);
        price.setFont(font);

        form.add(idL);
        form.add(id);
        form.add(nameL);
        form.add(name);
        form.add(catL);
        form.add(cat);
        form.add(qtyL);
        form.add(qty);
        form.add(priceL);
        form.add(price);

        JPanel center = new JPanel(new GridBagLayout());
        center.setBackground(new Color(225, 235, 255));
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

        save.setPreferredSize(new Dimension(130, 45));
        reset.setPreferredSize(new Dimension(130, 45));
        back.setPreferredSize(new Dimension(130, 45));

        buttons.add(save);
        buttons.add(reset);
        buttons.add(back);

        main.add(buttons, BorderLayout.SOUTH);

        frame.add(main, BorderLayout.CENTER);
        frame.add(CommonUI.footer(), BorderLayout.SOUTH);

        save.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame, "Product Saved"));

        reset.addActionListener(e -> {
            id.setText("");
            name.setText("");
            cat.setText("");
            qty.setText("");
            price.setText("");
        });

        back.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AddProduct();
    }
}
