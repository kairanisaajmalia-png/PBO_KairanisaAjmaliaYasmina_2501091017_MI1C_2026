/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kairanisa080626;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentCount {
     public static void main(String[] args) {
         StudentRecord aliRecord = new StudentRecord();
         StudentRecord aniRecord = new StudentRecord();
         StudentRecord deniRecord = new StudentRecord("Deni", "Batusangkar");
         deniRecord.print("");
         
         System.out.println();
         
         aliRecord.setName("Ali");
         aliRecord.setAddress("Padang");
         aliRecord.setAge(20);
         aliRecord.setMathGrade(80);
         aliRecord.setEnglishGrade(70);
         aliRecord.setScienceGrade(90);
         
         System.out.println("Data 1");
         System.out.println("Nama            : " + aliRecord.getName());
         System.out.println("Alamat          : " + aliRecord.getAddress());
         System.out.println("Umur            : " + aliRecord.getAge());
         System.out.println("Math Grade      : " + aliRecord.getMathGrade());
         System.out.println("English Grade   : " + aliRecord.getEnglishGrade());
         System.out.println("Science Grade   : " + aliRecord.getScienceGrade());
         System.out.println("Rata-rata       : " + aliRecord.getAverage());
         
         System.out.println();
         
         aniRecord.setName("Ani");
         aniRecord.setAddress("Bukittinggi");
         aniRecord.setAge(22);
         aniRecord.setMathGrade(80);
         aniRecord.setEnglishGrade(85);
         aniRecord.setScienceGrade(90);
         aniRecord.print("");
         
         System.out.println();
         
         System.out.println("Jumlah siswa     : " +StudentRecord.getStudentCount());
         
     }
}
