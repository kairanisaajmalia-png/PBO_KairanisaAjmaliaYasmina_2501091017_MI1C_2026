/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa1604;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatData {
        BukuAlamat [] data = new BukuAlamat[100];
    
    public void insert(BukuAlamat bukuAlamat, int index){
        data[index] = bukuAlamat;
    }
    
        public void update(BukuAlamat bukuAlamatBaru, int index){
         data[index] = bukuAlamatBaru;
    }
        
         public void delete(int index){
         data[index] = null;
    }
         
         public void view (){
         for(int i=0;i<data.length;i++) {
             if (data[i] != null){
             System.out.println("Data ke-" + (i + 1));
             System.out.println("Nama            : " + data[i].getName());
             System.out.println("Alamat          : " + data[i].getAddress());
             System.out.println("Telepon         : " + data[i].getTelepon());
             System.out.println("Email           : " + data[i].getEmail());
             System.out.println("---------------------------");
         }
         }
    }
}


