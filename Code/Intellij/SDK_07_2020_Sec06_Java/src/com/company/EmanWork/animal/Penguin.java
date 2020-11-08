package com.company.EmanWork.animal;

public class Penguin extends Bird implements NotFly {
    @Override
    public void walkMethod(String way1) {
        System.out.println(way1);
    }
}
