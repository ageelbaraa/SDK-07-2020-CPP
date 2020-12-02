package com.company.oop.Interface;

public class Bat extends Mammal implements Flyable {

    @Override
    public void Info() {
        System.out.println("Bat{Mammal{Animal}}");
    }

    @Override
    public void methodFly() {
        System.out.println("Method Fly");
    }

    @Override
    public String toString() {
        return "Bat{Mammal{Animal}}";
    }
}
