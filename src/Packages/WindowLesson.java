package Packages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowLesson extends JFrame {
    private         JPanel content = null;
    private         JButton button_1 = null;
    private         JButton button_2 = null;

    Window_1 window_1 = new Window_1();
    Window_2 window_2 = new Window_2();

    public WindowLesson() //      Описываем конструктор для нашего класса окно. Т.е. то что будет происходить при создании экземпляра класса
    {
        super("Тестовое окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = new JPanel();
        button_1 = new JButton("Open window №1");
        button_2 = new JButton("Open window №2");
        content.add(button_1);
        content.add(button_2);
        ActionListenerButtons();
        setContentPane(content);
        setBounds(50,50,500,500);
        setVisible(true);
        setResizable(false);
    }

    private void ActionListenerButtons()
    {
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window_2.setVisible(false);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                window_1.setVisible(true);
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window_1.setVisible(false);
                window_1.window_1_1.setVisible(false);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                window_2.setVisible(true);

            }
        });
    }
}
