
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syamsul
 */
public class PopUp {
    
    public static void main(String[] args) {
        String output = JOptionPane.showInputDialog(null,"Anda Sedang Belajar Apa ?","Input",3);
        JOptionPane.showMessageDialog(null,"Belajar " + output + " Sangatlah mudah","Message",3);                        
    }
    
}
