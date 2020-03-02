package Programm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {
    private         JPanel       content     = null;
    private         JButton      button      = null;
    private final   String       THIS_title  = "Окно";
    SecondWindow sw = new SecondWindow();
    public MyWindow()
    {
        super("Программа на Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        content = new JPanel();
        button = new JButton("Click me");
        addKeyMessage();
        content.add(button);

        setContentPane(content);
        setSize(400,400);
        setVisible(true);


    }

    private void addKeyMessage()
    {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sw.setBounds(50,50,500,500);
                sw.setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        });
    }
}
