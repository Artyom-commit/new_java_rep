package Packages;

import javax.swing.*;

public class Window_2 extends JFrame {
    private         JPanel content = null;
    private         JLabel label = null;

    public Window_2()
    {
        super("Окно номер 2");
        content = new JPanel();
        label =  new JLabel("Вы видите сообщение из окна №2");
        content.add(label);
        setContentPane(content);
        setSize(500,500);
        setResizable(false);
    }
}
