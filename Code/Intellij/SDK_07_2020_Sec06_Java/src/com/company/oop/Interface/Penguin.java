package com.company.oop.Interface;

public class Penguin extends Bird implements CannotFlyable {
    @Override
    public void methodCannotFly() {
        System.out.println("Method Can not Fly");
    }

    @Override
    public void Info() {
        System.out.println("Penguin{Bird{Animal}}");
    }

    @Override
    public String toString() {
        return "Penguin{Bird{Animal}}";
    }
}
