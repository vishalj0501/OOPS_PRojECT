package com.project ;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Mathematics Online Courses");
        System.out.println("Are you a Student?\n(Yes/No)");

        final Scanner sc = new Scanner(System.in);
            String UserInput, Yes, No;
            UserInput = sc.nextLine();
            
            if (UserInput.equalsIgnoreCase("yes")) {
                System.out.println("Please Login");
              //  Login.log();
                if(Login.log()) {
               	 AvailableCourses.courses();
               	 
                } 

            }
            //

            else if  (UserInput.equals("No") ||UserInput.equals("NO")||UserInput.equals("no")||UserInput.equals("nO")){
                System.out.println("Please Sign-up");
                System.out.println(SignUp.Register());
        }


    }
}