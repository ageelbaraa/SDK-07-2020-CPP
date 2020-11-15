package com.company.oop.Interface;

public class Bat extends Mammal implements Flyable {
    @Override
    public void methodFly() {
        System.out.println("Method Fly");
    }

    @Override
    public String toString() {
        return "Bat{Mammal{Animal}}";
    }
}
