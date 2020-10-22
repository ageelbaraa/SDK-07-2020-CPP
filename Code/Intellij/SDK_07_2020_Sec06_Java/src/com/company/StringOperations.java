package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String intellij = "IntelliJ IDEA is an integrated development " +
                "environment written in Java for developing computer software. " +
                "It is developed by JetBrains, and is available as an Apache 2 " +
                "Licensed community edition, and in a proprietary commercial edition. " +
                "Both can be used for commercial development";

        String str = "IntelliJ IDEA is an integrated development";
        String str2 = " ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        System.out.println(str.endsWith("ent"));

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("t", 18));

        System.out.println("****************************************************");

        String str3 = "A\nB\nC\nD";
        Stream<String> lines = str3.lines();
        lines.forEach(System.out::println);

        System.out.println("****************************************************");

        System.out.println(intellij.indexOf("IDEA"));
        System.out.println(str.compareTo("IntelliJ IDEA"));

        System.out.print("Enter Search Key : ");
        if(intellij.contains(scan.nextLine())){
            System.out.println("Found");
        }else
            System.out.println("Not Found");

        System.out.print("Enter your txt : ");
        intellij = scan.nextLine();

        if(intellij.equals("IDEA")){
            System.out.println("Yes");
        }



        System.out.println(intellij.toLowerCase());

        System.out.println(intellij.toUpperCase());

        String name ,email ;

        System.out.print("Enter your Name : ");
        name = scan.nextLine();

        email = name.toLowerCase().replace(" ","_").replace("'","").replace("-","");

        email = email + "@sdk.com";

        System.out.println(email);






    }
}
