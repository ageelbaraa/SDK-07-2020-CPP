package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double y , x;
        System.out.print("Enter X value : ");
        x = scan.nextDouble();
        y = Math.sin(12*x)+ 0.5*Math.tan(x);
        System.out.println("cos(12 * x) + 0.5 * tan(x) = " + y);

      
    }
}
