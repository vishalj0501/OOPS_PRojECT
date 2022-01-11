package com.project;

import java.util.Scanner;

public class Login {

    public static boolean log() {
        Scanner s= new Scanner(System.in);

        String Username, Password;
        System.out.println("Enter your Name To Login : ");
Username=s.nextLine();
        System.out.println("Enter your Password : ");
Password=s.nextLine();
if (Username.equals("Rolls") || (Password.equals("Royce"))){
	 System.out.println( "Welcome" + Username);
	 return true;
}
else{
     System.out.println( "Incorrect"  + Username + " plz enter a valid username");
     return false;
}
    }
}