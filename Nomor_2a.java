/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_260326;

import javax.swing.JOptionPane;

public class Nomor_2a {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai 3:"));

        double rata = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "Rata-rata: " + rata);

        if (rata >= 60) {
            JOptionPane.showMessageDialog(null, ":)");
        } else {
            JOptionPane.showMessageDialog(null, ":(");
        }
    }
}