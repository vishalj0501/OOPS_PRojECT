package com.project;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.util.Scanner;

public class AvailableCourses {

    public static String courses(){

    System.out.println("The Available courses are : ");

    System.out.println("Algebra\nTrigonometry\nCoordinate_Geometry\nCalculus");

    System.out.println("Your choice : ");

    Scanner cre=new Scanner(System.in);

    String Choice = cre.nextLine();


    if(Choice.equals("Algebra")){

        File alge = new File("/Users/vishu/IdeaProjects/OOPS PRojECT/src/com/project/Algebra.txt");
        

try {

    Scanner rd1= new Scanner(alge);//

    while (rd1.hasNextLine()){         //rd=read

        String c1=rd1.nextLine();      //c1=course1

        System.out.println(c1);
    }

    rd1.close();
}
catch (FileNotFoundException e){

e.printStackTrace();

}

    }

else if(Choice.equals("Coordinate_Geometry"))
{

        File Coorgeo = new File("/Users/vishu/IdeaProjects/OOPS PRojECT/src/com/project/Coordinate_Geometry.txt");

        try {

            Scanner rd2= new Scanner(Coorgeo);

            while (rd2.hasNextLine()){

                String c2=rd2.nextLine();

                System.out.println(c2);
            }
            rd2.close();
        }
        catch (FileNotFoundException e){

            e.printStackTrace();

        }
    }
    else if(Choice.equals("Calculus"))
    {
        File Calcu = new File("/Users/vishu/IdeaProjects/OOPS PRojECT/src/com/project/Calculus.txt");

        try {

            Scanner rd3= new Scanner(Calcu);

            while (rd3.hasNextLine()){

                String c3=rd3.nextLine();

                System.out.println(c3);

            }
            rd3.close();
        }
        catch (FileNotFoundException e){

            e.printStackTrace();

        }
    }
    else if(Choice.equals("Trigonometry"))

    {

        File trigo = new File("/Users/vishu/IdeaProjects/OOPS PRojECT/src/com/project/Trigonometry.txt");

        try {

            Scanner rd4= new Scanner(trigo);

            while (rd4.hasNextLine()){

                String c4=rd4.nextLine();

                System.out.println(c4);
            }
            rd4.close();
        }
        catch (FileNotFoundException e){

            e.printStackTrace();

        }
    }
    return " ";
}
    }

