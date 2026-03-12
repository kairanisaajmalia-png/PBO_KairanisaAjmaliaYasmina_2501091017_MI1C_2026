/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5_pbo2026;

/**
 *
 * @author LAB-SI-PC
 */
import javax.swing.JOptionPane;

public class KataTerakhir2 {
    public static void main(String[] args) {
        
        String word1 = JOptionPane.showInputDialog("Enter word1");
        String word2 = JOptionPane.showInputDialog("Enter word2");
        String word3 = JOptionPane.showInputDialog("Enter word3");
        
        String msg = word1 + " " + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}

