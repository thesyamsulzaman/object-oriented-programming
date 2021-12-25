/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author syamsul
 */
public class Kalkulator extends JFrame {

    JTextField input = new JTextField();

    JButton satu = new JButton("1");
    JButton dua = new JButton("2");
    JButton tiga = new JButton("3");
    JButton empat = new JButton("4");
    JButton lima = new JButton("5");
    JButton enam = new JButton("6");
    JButton tujuh = new JButton("7");
    JButton delapan = new JButton("8");
    JButton sembilan = new JButton("9");
    JButton nol = new JButton("0");

    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton kali = new JButton("*");
    JButton bagi = new JButton("/");
    JButton samaDengan = new JButton("=");
    JButton persen = new JButton("%");
    JButton modulo = new JButton("Mod");
    JButton exit = new JButton("Exit");

    Kalkulator() {
        super("Kalkulator");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setLocationRelativeTo(null);
        JPanel operatorPanel = new JPanel();

        operatorPanel.setLayout(new GridLayout(3, 6));
        operatorPanel.add(satu);
        operatorPanel.add(dua);
        operatorPanel.add(tiga);
        operatorPanel.add(empat);
        operatorPanel.add(lima);
        operatorPanel.add(enam);
        operatorPanel.add(tujuh);
        operatorPanel.add(delapan);
        operatorPanel.add(sembilan);
        operatorPanel.add(nol);
        operatorPanel.add(tambah);
        operatorPanel.add(kurang);
        operatorPanel.add(kali);
        operatorPanel.add(bagi);
        operatorPanel.add(samaDengan);
        operatorPanel.add(persen);
        operatorPanel.add(modulo);
        operatorPanel.add(exit);

        this.setLayout(new GridLayout(2, 1));
        this.add(input);
        this.add(operatorPanel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

    }

}
