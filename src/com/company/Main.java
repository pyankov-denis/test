package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ещё один проект");
        frame.setLayout(null);
        frame.setBounds(100,100,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Кнопка");
        button.setBounds(10,10,250,30);
        frame.add(button);
        JTextField textField = new JTextField();
        textField.setBounds(10,50,250,30);
        frame.add(textField);
        JLabel label = new JLabel("Надпись");
        label.setBounds(10,190, 250,30);
        frame.add(label);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Icon icon = new ImageIcon("D:/icon.jpg");
                JOptionPane.showMessageDialog(null, "Вы нажали на кнопку", "Предупреждение", JOptionPane.WARNING_MESSAGE, icon);
            }
        });
    }
}
