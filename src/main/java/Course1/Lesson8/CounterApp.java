package Course1.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private int value;
    private JLabel infoLabel;

    public CounterApp() {
        setBounds(500, 500, 200, 320);
        setTitle("Counter App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Шрифт
        Font font = new Font("Arial", Font.BOLD, 32);

        //Текстовое поле(нередактируемое)
        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        //Добавление инфопанели

        //Будем показывать ошибку, если значение счетчика по модулю больше десяти
        infoLabel = new JLabel();
        add(infoLabel, BorderLayout.NORTH);

        //Кнопки увеличения и уменьшения +1 -1
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        //Кнопки увеличения и уменьшения +10 -10
        JButton decrementButton10 = new JButton("<<");
        decrementButton10.setFont(font);
        add(decrementButton10, BorderLayout.NORTH);

        JButton incrementButton10 = new JButton(">>");
        incrementButton10.setFont(font);
        add(incrementButton10, BorderLayout.SOUTH);

        decrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value - 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        //Видимость окна
        setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 10) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
