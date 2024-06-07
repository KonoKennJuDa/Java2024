package Course1.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("The application has been closed");
            }
        });

        /*JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        add(button1, BorderLayout.NORTH);       //Не гибко, добавляем вручную клавишу у северной граници
        add(button2, BorderLayout.SOUTH);*/     //Не гибко, добавляем вручную клавишу у южной граници

        /*setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        for (int i = 1; i <= 10 ; i++) {
            JButton button = new JButton("#" + i); //Не гибко, в одну строку добавляет кнопки
            add(button);
        }*/

        /*setLayout(new FlowLayout());
        for (int i = 1; i <= 10 ; i++) {
            JButton button = new JButton("#" + i); //Гибко, распределяет кнопки в зависимости от размера экрана
            add(button);
        }*/

        /*setLayout(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            JButton button = new JButton("#" + i); //Гибко, распределяет кнопки по сетке
            add(button);
        }*/

        setLayout(null); //Пустой сетер


        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 120, 32);
        //Java swing on mouse event
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);
        JButton button = new JButton("Press here!");
        button.setBounds(20, 60, 120, 32);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Pressed");
            }
        });
        add(button);


        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
