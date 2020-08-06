package com.company;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 , num2;
        String choice;
        System.out.print("Enter Num1 value : ");
        num1 = scan.nextInt();
        System.out.println();
        System.out.print("Enter Num2 value : ");
        num2 = scan.nextInt();
        System.out.println();
        System.out.println("\n\n");

        while (true){
            System.out.println("1.For Sum Prss + .");
            System.out.println("2.For Subtract Prss - .");
            System.out.println("3.For multiply Prss * .");
            System.out.println("4.For Divsion Prss / .");
            System.out.println("4.For Reminder Prss % .");
            System.out.print("Enter You Choice : ");
            choice = scan.nextLine();
            System.out.println();

            switch (choice){
                case "+":{
//                    int result = Sum(num1,num2);
//                    System.out.println("The Sum is " + result);
                    System.out.println("The Sum is = " + Sum(num1,num2));
                    System.out.println("\n\n");

                }break;
                case "-":{
//
                    System.out.println("The Subtract is = " + Subtract(num1,num2));
                    System.out.println("\n\n");

                }break;
                case "*":{
//
                    System.out.println("The multiply is = " + multiply(num1,num2));
                    System.out.println("\n\n");

                }break;
                case "/":{
//
                    System.out.println("The Divsion is = " + Divsion(num1,num2));
                    System.out.println("\n\n");

                }break;
                case "%":{
//
                    System.out.println("The Reminder is = " + Reminder(num1,num2));
                    System.out.println("\n\n");

                }break;
                case"e":{
                    System.exit(0);
                }

                default:{
                    System.out.println("Wrong input");
                }


            }

        }




    }

    static int Sum(int num1 , int num2){
//        int sum ;
//        sum = num1 + num2 ;
//        return sum;
        return  num1 + num2;
    }

    static int Subtract(int num1 , int num2){
        return num1 - num2;
    }

    static int multiply(int num1 , int num2){
        return num1 * num2;
    }

    static int Divsion(int num1 , int num2){
        return num1 / num2;
    }

    static int Reminder(int num1 , int num2){
        return num1 % num2;
    }

}
