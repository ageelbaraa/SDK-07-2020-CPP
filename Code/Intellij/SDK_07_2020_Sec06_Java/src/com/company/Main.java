package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.SplittableRandom;

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
        int age;

        // non - primitive dataType
        String name = "Jon Smith";
        Array arrayData;
        List listData;

        System.out.println("My Name is " + name); // concatenation

        // String --
        String password = "LKJHDkJSGD";
        String secondName = "براء عقيل";
        age = 12;

        // Format in String
        System.out.println(String.format("%d", 125412));
        System.out.println(String.format("%s", password));
        System.out.println(String.format(Locale.getDefault(), "%s", secondName));


        System.out.println(String.format("My Age is : %d",age));

        System.out.println("My age is " + 15*2 + " And My GBA is " + 3.5
                + "O sorry i forget tell my name , My name is jon"+"My Name first Letter is " + 'F' + "Is am i fat ? " + false);


        String details = "15 degree" + " and 5 up ";
        String details_2 = 50+30+"Sachin"+40+40; // output is : 80Sachin4040

        String finalDetails = details.concat(details_2);
        String finalDetails_2 = finalDetails.concat(" ali" + 45);

        finalDetails_2+=finalDetails;

        System.out.println(finalDetails_2);

        int a = 12345;

        String out = "The value of integer is : "+ a;

        System.out.println(out);

        out += " And the value of a floating point number is :"+ 45.01f;

        System.out.println(out);

        boolean bl = false;
        double d = 21.0129312312;
        char s ='y';
        byte bt = 10;

        out += ", "+ bl + ", "+d + ", "+s+ ". And a byte is:"+bt;

        System.out.println(out);

        System.out.printf("%5s\n","هانتانتيبانتيب");

        System.out.printf(Locale.getDefault(),"%d",654654564);





    }
}
