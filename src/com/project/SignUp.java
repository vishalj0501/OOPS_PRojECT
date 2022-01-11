package com.project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {

    public static String Register()throws IOException {

        Scanner se = new Scanner(System.in);

// name, phone number, username, password
        System.out.println("Enter your name: ");

        String name = se.nextLine();

        System.out.println("Enter your Phone Number: ");

        String phone = se.next();

        System.out.println("Enter your username: ");

        String username = se.next();
        try {
            if (checkUsername(username) == false)

            {
                System.out.println("Enter your password: ");

                String password = se.next();

                String data = username + "," + password + "," + name + "," + phone;



                FileWriter f = new FileWriter("signup.txt", true);

                f.write("\n" + data);

                System.out.println(data);

                f.close();

            } else {
                System.out.println("Username is taken");
                Register();
            }
        } catch (IOException e) {

// TODO Auto-generated catch block

            e.printStackTrace();
        }
        return name;
    }
    private static boolean checkUsername(String username) {

// TODO Auto-generated method stub
        return false;
    }
}