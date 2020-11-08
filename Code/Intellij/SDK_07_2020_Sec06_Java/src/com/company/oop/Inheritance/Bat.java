package com.company.oop.Inheritance;

public class Bat extends Mammal implements Flyable{

    @Override
    public void flyMethod() {
        System.out.println("This Bat is Mammal but it can fly");
    }
}
