/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project30;

import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project30 {
//  make a array that can input names of things.
// make a array that shows number 3 (line33)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        String namaBarang[] = new String[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Insert Nama Barang");
            namaBarang[i] = scan.next();
        }
         for(int i = 0; i < 10; i++){
             System.out.println("Nama Barang = "+namaBarang[i]);
         }         
         for(int i = 0; i < 10; i++){
             
             if(i == 2){
                 System.out.println("Array Index 3 = "+namaBarang[2]);
             }
             
         }   
    }

}
