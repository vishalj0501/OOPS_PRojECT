package com.project;

import java.util.Scanner;

public class Login {

    public static String log() {
        Scanner s= new Scanner(System.in);

        String Username, Password;
        System.out.println("Enter your Name To Login : ");
Username=s.nextLine();
        System.out.println("Enter your Password : ");
Password=s.nextLine();
if (Username.equals("Rolls") || (Password.equals("Royce"))){
    return "Welcome Royce ! ";
}
else{
    return "Incorrect Username or Password";
}
    }
}