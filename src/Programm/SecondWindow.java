package Programm;

import javax.swing.*;

public class SecondWindow extends JFrame {
    private         JPanel content = null;
    private         JButton button = null;
    private final   String  THIS_title = "Какой-то заголовок";


    public SecondWindow()
    {
        super("Второе окно которое открывается при нажатии на кнопку");
        content =  new JPanel();
        button = new JButton("Вторая кнопка");
        content.add(button);
        setContentPane(content);
        setBounds(50,50,500,500);
        setResizable(false);
    }
}
