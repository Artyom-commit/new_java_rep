package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewDialogWindow extends JFrame {

    private         JPanel content = null;
    private         JButton button = null;
    private final   String  TITLE_message = "Окно сообщения";

    public NewDialogWindow()
    {
        super("Окно с кнопками");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content = new JPanel();
        button = new JButton("Кнопка");
        addMessageListener();
        content.add(button);
        setContentPane(content);
        setSize(500,400);
        setVisible(true);
    }

    private void addMessageListener(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogWindow dw = new DialogWindow();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }
    public static void main(String[] args){
        NewDialogWindow ndw = new NewDialogWindow();


    }
}
