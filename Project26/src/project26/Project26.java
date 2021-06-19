/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project26;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project26 {

public static String firstName ="", lastName="",email="",password="";
static void signup (){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert Your FirstName:");
    firstName = scan.next();
    System.out.println("Insert Your LastName:");
    lastName = scan.next();
    System.out.println("Insert Your Email:");
    email = scan.next();
    System.out.println("Insert Your Password:");
    password = scan.next();
    
}
static boolean login(String localEmail, String localPassword){
    if(localEmail.equalsIgnoreCase(email)&& localPassword.equalsIgnoreCase(password)){
        return true ;
    }
    else{
        return false;
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String localEmail, localPassword;
        Scanner scan = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println("1.Signup");
            System.out.println("2.Login");
            i = scan.nextInt();
            switch(i){
                case 1 :
                    signup();
                    break;
                case 2 :
                    boolean temp;
                    System.out.println("Insert your Email:");
                    localEmail = scan.next();
                    System.out.println("Insert Your Password:");
                    localPassword = scan.next();
                    temp = login(localEmail,localPassword);
                    if (temp==true){
                        System.out.println("You are In");
                    }
                    else{
                        System.out.println("Wrong email and password");
                    }
                    break;
                    
            }
                    
        }while(i!=0);
    
    }
    
}
