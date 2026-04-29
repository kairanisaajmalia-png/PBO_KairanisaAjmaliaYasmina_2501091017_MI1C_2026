/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa1604;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExamples {
    public static void main (String[]args){
        BukuAlamatData data = new BukuAlamatData();
        BukuAlamat bukuAlamat = new BukuAlamat();
        bukuAlamat.setName("Ali");
        bukuAlamat.setAddress("Padang");
        bukuAlamat.setTelepon(12345678);
        bukuAlamat.setEmail("ali@coba.com");
        data.insert(bukuAlamat, 0);
        
        System.out.println();
        
        bukuAlamat = new BukuAlamat();
        bukuAlamat.setName("Budi");
        bukuAlamat.setAddress("Padang");
        bukuAlamat.setTelepon(87654321);
        bukuAlamat.setEmail("budi@coba.com");
        data.insert(bukuAlamat, 1);
        data.delete(0);
        data.view();
        
    }
}
