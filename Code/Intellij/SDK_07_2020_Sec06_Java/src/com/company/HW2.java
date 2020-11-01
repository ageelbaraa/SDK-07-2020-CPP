package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        HW2 hw2 = new HW2();
//        hw2.ageChecker(12);


        int choice;

        while (true){
            System.out.println();
            System.out.println();
            menu();
            System.out.println();
            System.out.print("\nEnter Your Choice : ");
            if((choice = scan.nextInt()) != 0){
                switch (choice) {
                    case 1: {
                        double x;
                        System.out.print("Enter X value : ");
                        x = scan.nextDouble();
                        System.out.println("cos(12 * x) + 0.5 * tan(x) = " + mathematicalEquation(x));
                    }
                    break;
                    case 2: {
                        double number1, number2;
                        System.out.print("Enter First Number : ");
                        number1 = scan.nextDouble();
                        System.out.print("Enter Second Number : ");
                        number2 = scan.nextDouble();
                        System.out.println();
                        simpleCalculator(number1, number2);
                    }
                    break;

                    case 3: {
                        int num1, num2, num3;
                        System.out.println("Enter Three Variable Values : ");
                        num1 = scan.nextInt();
                        num2 = scan.nextInt();
                        num3 = scan.nextInt();
                        System.out.println();
                        minMax(num1, num2, num3);
                    }
                    break;
                    case 4: {
                        System.out.print("Enter Age : ");
                        int age = scan.nextInt();
                        System.out.println();
                        ageChecker(age);
                    }
                    break;
                    case 5: {
                        System.out.print("Enter row number : ");
                        int rowNumber = scan.nextInt();
                        shapePrinter(rowNumber);
                    }
                    break;
                    case 6: {
                        System.out.print("Enter Some Character : ");
                        char someChar = scan.next().charAt(0);
                        System.out.println();
                        asciiCharacterChecker(someChar);
                    }
                    break;
                }
            }else {
                break;
            }
        }
    }

    static void menu() {
        System.out.println("1.Mathematical Equation");
        System.out.println("2.Simple Calculator");
        System.out.println("3.Min Max");
        System.out.println("4.Age Checker");
        System.out.println("5.Shape Printer");
        System.out.println("6.Ascii Character Checker");
    }

    static double mathematicalEquation(double x) {
        System.out.println("This Function Calculate cos(12 * x) + 0.5 * tan(x)");
        return Math.sin(12 * x) + 0.5 * Math.tan(x);
    }

    static void simpleCalculator(double n1, double n2) {
        System.out.printf("The Sum is : %.2f\n", (n1 + n2));
        System.out.printf("The difference is : %.2f\n", (n1 - n2));
        System.out.printf("The product is : %.2f\n", (n1 * n2));
        System.out.printf("The division  is : %.2f\n", (n1 / n2));
        System.out.printf("The reminder is : %.2f\n", (n1 % n2));
    }

    static void minMax(int n1, int n2, int n3) {
        int min, max;
        min = n1;
        max = n2;
        if (n2 < n1) {
            min = n2;
        } else if (n3 < n1) {
            min = n3;
        }
        System.out.printf("The Min is : %d\n", min);

        if (n1 > n2) {
            max = n1;
        } else if (n3 > n2) {
            max = n3;
        }
        System.out.printf("The Max is : %d\n", max);
    }

    static void ageChecker(int age) {
        if (age > 0 && age <= 14) {
            System.out.println("Children");
        } else if (age >= 15 && age <= 24) {
            System.out.println("Youth");
        } else if (age >= 25 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        }
    }

    static void shapePrinter(int n) {
        System.out.println("This Function Print Two Shape ,\nThis Is The First One");

        for (int i = 0; i < n; i++) { // Row
            for (int j = i; j < n; j++) { // column
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This Function Print Two Shape ,\nThis Is The Second One");
        for (int i = 0; i < n; i++) { // Row
            for (int j = 0; j <= i; j++) { // column
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void asciiCharacterChecker(char someChar) {
        if (someChar == '#') {
        } else {
            if (someChar >= 'A' && someChar <= 'Z') {
                System.out.println("Capital");
            } else if (someChar >= 'a' && someChar <= 'z') {
                System.out.println("Small");
            } else if (someChar >= '0' && someChar <= '9') {
                System.out.println("Digit");
            } else {
                System.out.println("None");
            }
        }

    }


}
