package Packages;

import javax.swing.*;

public class Window_1_1 extends JFrame {
    private         JPanel content = null;
    private         JLabel label = null;

    public Window_1_1()
    {
        super("Подраздел окна номер №1");
        content = new JPanel();
        label = new JLabel("Вы попали в подраздел окна номер 1");
        content.add(label);
        setContentPane(content);
        setSize(500,500);
        setResizable(false);
    }
}
