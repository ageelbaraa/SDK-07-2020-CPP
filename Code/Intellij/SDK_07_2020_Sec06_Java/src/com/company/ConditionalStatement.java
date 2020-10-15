package com.company;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // conditional Statement include if , if - else , if - else if - else , nested if

        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age : ");
        age = scan.nextInt();

        if (age > 18)
            System.out.println("Adult");
        else
            System.out.println("child");

        if(age > 0){
            if(age >= 1 && age <= 5){
                System.out.println("baby");
            }else if(age >= 6 && age <= 12){
                System.out.println("child");
            }else if(age >= 13 && age <= 18){
                System.out.println("youth");
            }else if(age >= 19 && age <= 50){
                System.out.println("man");
            }else {
                System.out.println("Senior");
            }
        }else {
            System.out.println("not human");
        }

        
    }
}
