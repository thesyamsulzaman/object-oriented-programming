/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author syamsul
 */
public class QuizCalculator extends JFrame implements MouseListener, ActionListener {

    JTextField firstValue = new JTextField();
    JTextField secondValue = new JTextField();
    JTextField userInput = new JTextField();
    JLabel resultText = new JLabel();
    JButton checkButton = new JButton("CHECK");

    int randomFirstValue = getRandomNumber(1, 10);
    int randomSecondValue = getRandomNumber(1, 20);

    QuizCalculator() {
        super("Quiz Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        // Register Event Listener
        userInput.addMouseListener(this);
        checkButton.addMouseListener(this);
        checkButton.addActionListener(this);
        userInput.addKeyListener(new InputToIntegerOnly(userInput));

        // Buat Layout
        JPanel guessBoardPanel = new JPanel();
        guessBoardPanel.setLayout(new GridLayout(1, 3));
        guessBoardPanel.add(firstValue);
        guessBoardPanel.add(secondValue);
        guessBoardPanel.add(userInput);

        this.setLayout(new GridLayout(3, 1));
        this.add(guessBoardPanel);
        this.add(checkButton);
        this.add(resultText);

        //Inisialisasi
        firstValue.setText(Integer.toString(randomFirstValue));
        secondValue.setText(Integer.toString(randomSecondValue));
        firstValue.setEditable(false);
        secondValue.setEditable(false);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public class InputToIntegerOnly extends KeyAdapter {

        JTextField input;

        InputToIntegerOnly(JTextField input) {
            this.input = input;
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (!"".equals(input.getText())) {
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == 8) {
                    input.setEditable(true);
                } else {
                    input.setEditable(false);
                }
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            int userInputValue = Integer.parseInt(userInput.getText());

            if (ae.getSource() == checkButton) {
                if (randomFirstValue + randomSecondValue == userInputValue) {
                    resultText.setText("Selamat, jawaban anda benar !!");
                    getContentPane().setBackground(Color.green);
                } else {
                    resultText.setText("Maaf, jawaban anda salah !!");
                    getContentPane().setBackground(Color.red);
                }
            }
        } catch (NumberFormatException err) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Masukan jawaban anda");
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuizCalculator kalkulator = new QuizCalculator();
    }

}
