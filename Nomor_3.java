/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_260326;

import java.io.*;

public class PangkatTanpa1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan angka: ");
        int angka = Integer.parseInt(br.readLine());

        System.out.print("Masukkan pangkat: ");
        int pangkat = Integer.parseInt(br.readLine());

        int hasil = angka;

        for (int i = 1; i < pangkat; i++) {
            hasil = hasil * angka;
        }

        System.out.println("Hasil = " + hasil);
    }
}
        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * angka;
        }

        System.out.println("Hasil = " + hasil);
    }
}
