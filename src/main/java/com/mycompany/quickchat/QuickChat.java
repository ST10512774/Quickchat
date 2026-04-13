/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;

import java.util.Scanner;

public class QuickChat {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Créer l'objet Login
        Login app = new Login();
        
        System.out.print("Enter your firstname: ");
        String firstname = scan.next();
        
        System.out.print("Enter your lastname: ");
        String lastname = scan.next();
        
        System.out.print("Enter your username: ");
        String username = scan.next();
        
        System.out.print("Enter your password: ");
        String password = scan.next();
        
        System.out.print("Enter your cellphone (+27721234567): ");
        String cellphone = scan.next();
        
        String output = app.registerUser(firstname, lastname, username, password, cellphone);
        System.out.println(output);
        
        //Test first name
        if(output.contains("is not correctly")){
            scan.close();
            return;
        }
        
        System.out.println("\n=== LOGIN ===");
        System.out.print("Enter your username: ");
        String loginUsername = scan.next();
        
        System.out.print("Enter your password: ");
        String loginPassword = scan.next();
        
        boolean loginOutput = app.loginUser(loginUsername, loginPassword);
        
        System.out.println(app.returnLoginStatus(loginOutput));
        
        scan.close();
    }
}