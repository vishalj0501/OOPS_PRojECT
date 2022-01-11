package com.project;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        System.out.println("Hi There!\nHow may I help you ?");

        System.out.println("A) General FAQS\nB) Technical Enquiry\nC) Contact a Mentor");
        Scanner hlp=new Scanner(System.in);
        String HelpInput= hlp.nextLine();

        if(HelpInput.equals("A")){

            System.out.println("a)Course FAQS\nb)Other");
            String HelpChoice=hlp.nextLine();
            if(HelpChoice.equals("a")){
                System.out.println("Please WhatsApp/Call: 9985979888");
            }
            else if(HelpChoice.equals("b")){

                System.out.println("Please mail: mochelpother@gmail.com");
            }
        }
        else if(HelpInput.equals("B")){

            System.out.println("Please WhatsApp/Call: 8074594194");
            System.out.println("              or");
            System.out.println("Please Mail: mocmohittech@gmail.com");
        }
        else if(HelpInput.equals("C")){

            System.out.println("Please Contact:");
            System.out.println("7907013955\n9550232219\n7981821463\n9493666987");
            System.out.println("        Or");
            System.out.println("Mail:");
            System.out.println("mocprnvmentor@gmail.com\n mocvishmentor@gmail.com\n moccharmentor@gmail.com\n mocmohit2mentor@gmail.com");
        }
        System.out.println("Thank You");
        System.out.println("Hope we could resolve your query");
    }
}
