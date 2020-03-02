package Packages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window_1 extends JFrame {
    private         JPanel content = null;
    private         JLabel text = null;
    private         JLabel text_1 = null;
    private         JButton button_1 = null;
    private         JTextField smallText = null;

    Window_1_1 window_1_1 = new Window_1_1();
    public Window_1()
    {
        super("Окно номер №1");
        content = new JPanel();
        text = new JLabel("Вы открыли окно номер №1");
        text_1 = new JLabel("Нажмите кнопку что бы открыть подраздел этого окна");
        button_1 = new JButton("Открыть");
        smallText = new JTextField(15);
        content.add(text);
        content.add(text_1);
        content.add(button_1);
        content.add(smallText);
        ActionButton();
        setContentPane(content);
        setSize(400,500);
        setResizable(false);

    }

    private void ActionButton()
    {
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window_1_1.setVisible(true);
            }
        });
        smallText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Window_1.this,
                        "Вы ввели" + smallText.getText());
            }
        });
    }
}
