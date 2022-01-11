package com.project;

import java.util.Scanner;

public class UPi  {
    public static void main(String[] args) {

        System.out.println("What would you like to pay with : ");

        System.out.println("A. Paytm\nB. GooglePay");

        Scanner up= new Scanner(System.in);

        String payChoice=up.nextLine();
        if(payChoice.equals("A") || payChoice.equals("B") ){
            BuyCourse.buycourse();
        }
       // return "";
    }
}
