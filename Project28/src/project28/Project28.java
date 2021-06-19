/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project28;

/**
 *
 * @author London
 */
public class Project28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int terbesar = 0;
        int data[]={10, 124, 22, 123, 1245, 624, 511, 32, 5102};
    
    for(int i = 0; i<data.length; i++){
        System.out.println("Data"+data[i]);
        if (data[i]>terbesar){
            terbesar = data[i];
        }
  
    }
        System.out.println("Nilai terbesar dari data = "+terbesar);
    } 
    
    
    
    
            
}
