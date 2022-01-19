package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        label.setBounds(10,90, 250,30);
        frame.add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Icon icon = new ImageIcon("D:/icon.jpg");
                JOptionPane.showMessageDialog(null, "Вы нажали на кнопку", "Предупреждение", JOptionPane.WARNING_MESSAGE, icon);
            }
        });
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Icon icon2 = new ImageIcon("D:/icon.jpg");
                JOptionPane.showMessageDialog(null, "Вы нажали на интер", "Партия гордится тобой", JOptionPane.WARNING_MESSAGE, icon2);
            }
        });
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Клавиша опущена");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Клавиша поднята");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("курсор");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    System.out.println("Ошибка");
                }
                label.setText("курсор убрали");
            }
        });
        frame.setVisible(true);
    }
}
