/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_260326;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nomor_1a {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai 1: ");
        double n1 = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai 2: ");
        double n2 = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai 3: ");
        double n3 = Double.parseDouble(input.readLine());

        double rata = (n1 + n2 + n3) / 3;

        System.out.println("Rata-rata: " + rata);

        if (rata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}