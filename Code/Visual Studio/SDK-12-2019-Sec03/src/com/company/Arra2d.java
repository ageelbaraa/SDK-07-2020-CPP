package com.company;

import java.util.Random;

public class Arra2d {

    public static void main(String[] args) {
        int[][] arr2d = new int[6][8];
        Random rand = new Random();

        System.out.print("{");
        for(int i = 0 ; i < arr2d.length ; i++){
            for(int j = 0 ; j < arr2d[i].length;j++){
                arr2d[i][j] = rand.nextInt(100);
                System.out.print(arr2d[i][j] + " , ");
            }
            System.out.println();
        }
        System.out.println("\b\b }");

    }



}
