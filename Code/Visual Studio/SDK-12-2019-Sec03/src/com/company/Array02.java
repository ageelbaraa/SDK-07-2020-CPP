package com.company;

import java.util.Random;
import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        // write your code here
        // new : we create an instance when we use it ;

        // 1D array

//        double[] irrashArray = new double[50];
//        Random rand = new Random();
//
//        for(int i =0 ; i < irrashArray.length ;i++){
//            irrashArray[i] = rand.nextDouble();
//        }
//
//        System.out.print("{");
//        for(int i = 0 ;i < irrashArray.length ;i++){
//            System.out.print(irrashArray[i] + " , ");
//            if(i % 10 == 0)
//                System.out.println();
//        }
//        System.out.print("\b\b }");

        // 2D Array

//        int[][] arr2D = new int[2][5];
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0 ; i < arr2D.length;i++){
//            for (int j = 0 ; j < arr2D[i].length;j++){
//                arr2D[i][j] = scanner.nextInt();
//            }
//        }
//
//        for(int i = 0 ; i < arr2D.length;i++){
//            for (int j = 0 ; j < arr2D[i].length;j++){
//                System.out.print(arr2D[i][j] + " , ");
//            }
//            System.out.println();
//        }

        // examples ::


        int[] arr02 = new int[50];
        Random rand = new Random();
        int max = -1000000; int min = 1000000 ;



        for(int i =0 ; i < arr02.length ;i++){
            arr02[i] = rand.nextInt(100);
        }
        System.out.print("{");
        for(int i =0 ; i < arr02.length ;i++){
            System.out.print(arr02[i] + " , " );
            if(i%10 == 0)
                System.out.println();
            if(arr02[i] > max){
                max = arr02[i];
            }
            if(arr02[i] < min) {
                min = arr02[i];
            }
        }
        System.out.print("\b\b }");

        System.out.println();

        System.out.println("The max value is : " + max);
        System.out.println("The min value is : " + min);





    }
}
