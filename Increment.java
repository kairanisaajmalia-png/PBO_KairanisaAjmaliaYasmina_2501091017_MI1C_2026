/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Increment {
    public static void main ( String [] args){
        int i = 10;
        int j = 3;
        int k = 0;
       
    System.out.println("Variable value...");
    System.out.println("    i = " + i);
    System.out.println("    j = " + j);
    System.out.println("Increment...");
    System.out.println("    k = " + (j++ + i));
    System.out.println("    k = " + (++j + --i)); 
    }
}
