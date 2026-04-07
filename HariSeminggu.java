/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa0204;

/**
 *
 * @author LAB-SI-PC
 */
public class HariSeminggu {
    public static void main(String[] args) {

        String hari[] = {
            "Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday","Sunday"
        };

        int a = 0;

        while (a < 1) {

            for (int i = 0; i < 7; i++) {
                System.out.println(hari[i]);
            }

            System.out.println();

            int i = 0;
            do {
                System.out.println(hari[i]);
                i = i + 1;
            } while (i < 7);

            a++;
        }
    }
}