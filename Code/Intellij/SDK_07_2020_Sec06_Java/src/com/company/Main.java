package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // primitive dataType
        int firstNumber = 1000000;
        float secondNumber = 100.36f;
        double doubleNumber = 10.36f;
        char charLetter = 'A';
        boolean isNumber = true;
        short shortNumber = 32000;
        long longNumber = 1000000000;
        byte byteNumber = 127;

        // non - primitive dataType
        String name = "Jon Smith";
        Array arrayData ;
        List listData;

        System.out.println("My Name is " + name); // concatenation

        // String --
        String password = "LKJHDkJSGD";
        String secondName = "براء عقيل";

        // Format in String
        System.out.println(String.format("%d",125412));
        System.out.println(String.format("%s",password));
        System.out.println(String.format(Locale.getDefault(),"%s",secondName));



    }
}
