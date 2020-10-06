package com.company;

public class Loops {

    public static void main(String[] args) {

        // 1. while loop
        int count = 20;
        while(count > 0){
            System.out.println(count);
            count--;
        }

        // 2. do while loop

        do{
            System.out.println(count);
        }while (count > 0);

        // 3. for loop

//        for(int i = 0 ; i < 10 ; i++){
//            System.out.println("i = " + i);
//        }

//        for(int i = 0 ; i < 100 ; i*=10){  // infinte loop
//            System.out.println("i = " + i);
//        }

        for(int i = 1 ; i <= 100 ; i*=10){
            System.out.println("i = " + i);
        }

        int i = 0, j = 0;
        for (; i < 10; i++)
        {
            j = i;

            while (j > 0)
                System.out.println("I : "+ i + ", J : "+ j--);
        }
    }
}
