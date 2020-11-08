package com.company;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name ,className , classNo ;  // for string we use nextLine() , next();
        boolean isFinish; // for boolean we use nextBoolean();
        double mGBA; // for double we use nextDouble();
        int materialCredit; // for integer we use nextInt();
        char letter;

        String someString;
        char someChar;

//        System.out.print("Enter Your Name : ");
//        name = scan.nextLine();
//        System.out.print("Enter Your Class Name : ");
//        className = scan.nextLine();
//        System.out.print("Enter Your Class No : ");
//        classNo = scan.nextLine();
//        System.out.print("Enter Your Class Credit : ");
//        materialCredit = scan.nextInt();
//        System.out.print("Are You Finish The Class ?  ");
//        isFinish = scan.nextBoolean();
//        System.out.print("Enter Your GBA : ");
//        mGBA = scan.nextDouble();
        System.out.print("Enter an letter : ");
        letter = scan.next().charAt(0);

        System.out.print("Enter an String : ");
        someString = scan.next();

        System.out.print("Enter an letter : ");
        someChar = scan.next().charAt(0);

        System.out.println(letter + "  "  + someString + "  " + someChar);

//        String format = "| %-10s || %-10s || %-10s || %-11d || %-10b || %-10f |";
//        String headlineFormat = "| %-10s || %-10s || %-10s || %-10s || %-10s || %-10s |";
//        System.out.println(String.format(headlineFormat,"Name","Class Name","Class No","Clss Credit","Is Finish","GBA"));
//        System.out.println(String.format(format,name,className,classNo,materialCredit,isFinish,mGBA));


    }
}
