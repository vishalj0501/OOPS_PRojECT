package com.project;

import java.util.Scanner;

public class Login {
	//String Username, Password;
    public static boolean log() {
    	String Username, Password;
    	Scanner s= new Scanner(System.in);

        
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