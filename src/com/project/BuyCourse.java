package com.project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BuyCourse {
 //   public static void main(String[] args) {

public static String buycourse(){

        System.out.println("Which course would you like to buy : ");

        System.out.println("Algebra\nTrigonometry\nCoordinate_Geometry\nCalculus");

        System.out.println("Your choice : ");
        Scanner buy= new Scanner(System.in);

        String UserPurchase = buy.nextLine();

    if(UserPurchase.equals("Algebra")) {
        System.out.println("Course Price : $2000/month ");
        System.out.println("Are you willing to purchase this course ? ");
        //   String Yes,No;

        String BuyChoice = buy.nextLine();
//String Password=buy.nextLine();
        if (BuyChoice.equals("Yes")) {
            // System.out.println(UPi.upipay());
            System.out.println("Enter your password Paytm : ");
            String Password = buy.nextLine();
            if (Password.equals("****")){
                System.out.println("$2000 has been deducted from your wallet ! ");
                System.out.println("Thank you for Purchasing the Algebra course");
                try {
                    FileWriter algfile = new FileWriter("AlgebraMaterial.txt");
                    algfile.write("We need to put in the links here...algebra...,links...");      // in the  MEET
                    algfile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (BuyChoice.equals("No")) {
                System.out.println("Thank You for considering us.");
            }

        } else {
            System.out.println("Wrong Password..Login again..");
        }
    }
   //////////////////////////////////////////////////////////////////////////////////////////////////////

       else if(UserPurchase.equals("Trigonometry")){
            System.out.println("Course Price : $1000/month ");
            System.out.println("Are you willing to purchase this course ? ");
            //   String Yes,No;

            String BuyChoice= buy.nextLine();

            if( BuyChoice.equals("Yes"))
            {
                try {
                    FileWriter trigofile = new FileWriter("TrigoMaterial.txt");
                    trigofile.write("We need to put in the links here,,..trigo trigo.");      // in the  MEET
                    trigofile.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }

            }
            else if(BuyChoice.equals("No")) {
                System.out.println("Thank You for considering us.");
            }

        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


       else if(UserPurchase.equals("Coordinate_Geometry")){
            System.out.println("Course Price : $3000/month ");
            System.out.println("Are you willing to purchase this course ? ");
            //   String Yes,No;

            String BuyChoice= buy.nextLine();

            if( BuyChoice.equals("Yes")){
                try {
                    FileWriter Coordinatefile = new FileWriter("CoordinateGeometryMaterial.txt");
                    Coordinatefile.write("We need to put in the links here,,cccccccccgggggggggg...");      // in the MEET
                    Coordinatefile.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }

            }
            else if(BuyChoice.equals("No")) {
                System.out.println("Thank You for considering us.");
            }

        }
       /////////////////////////////////////////////////////////////////////////////////////////////////

        else if(UserPurchase.equals("Calculus")){
            System.out.println("Course Price : $5000/month ");
            System.out.println("Are you willing to purchase this course ? ");
            //   String Yes,No;

            String BuyChoice= buy.nextLine();

            if(BuyChoice.equals("Yes")){
                try {
                    FileWriter calfile = new FileWriter("CalculusMaterial.txt");
                    calfile.write("We need to put in the links here,,..calculus.");      // in the MEET
                    calfile.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }

            }
            else if(BuyChoice.equals("No")) {
                System.out.println("Thank You for considering us.");
            }

        }
else{
            System.out.println("Invalid Input (or) Course not available currently");
        }
return " ";
    }
}
