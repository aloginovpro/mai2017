package ru.mai.learning.gui;

import javax.swing.*;
import java.awt.*;

public class SwingExample {

    private static int operand1 = 0;
    private static Action lastAction = null;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(400, 300));
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(100, 50, 200, 50);
        frame.add(textField);

        for (int i = 0; i < 9; i++) {
            JButton number = new JButton("" + (i + 1));
            number.setBounds(
                    50 + (i % 3) * 50,
                    150 + (i / 3) * 50,
                    50, 50
            );
            frame.add(number);
            final int value = i;
            number.addActionListener(e -> textField.setText(
                    textField.getText() + (value + 1)
            ));
        }

        Action[] values = Action.values();
        for (int i = 0; i < values.length; i++) {
            Action action = values[i];
            JButton button = new JButton(action.view);
            button.setBounds(
                    250 + (i % 2) * 50,
                    150 + (i / 2) * 50,
                    50, 50
            );
            frame.add(button);
            button.addActionListener(e -> {
                operand1 = Integer.valueOf(textField.getText());
                textField.setText("");
                lastAction = action;
            });
        }

        JButton equalsButton = new JButton("=");
        equalsButton.setBounds(400, 150, 50, 50);
        frame.add(equalsButton);
        equalsButton.addActionListener(e -> {
            int operand2 = Integer.valueOf(textField.getText());
            int result = lastAction.apply(operand1, operand2);
            operand1 = result;
            textField.setText("" + result);
        });

        frame.setVisible(true);
    }

}
