package com.company;

public class Loops {
    public static void main(String[] args) {
//        int x = 2, d = 2;
//        for (x = 0, d = 0, System.out.println("A"), System.out.println("A1"), System.out.println("A2");
//             x < 10;
//             System.out.println("C"), System.out.println("C1"), System.out.println("C2")) System.out.println("x++ = " + x++);


        short a = 5;

        a = 0;
        while (a < 10) {
            System.out.println("a = " + ++a);
            if(a % 3  == 0)
                continue;

            System.out.println("After break/continue");
        }

        System.out.println("Finally a = " + a);


        short i = 0, j;
        for (; i < 10; i++) {
            j = i;
            while (j > 0) {
                System.out.println("I = " + i + ", J= " + j--);
            }
        }
        System.out.println("Finally i = " + i);

    }
}
