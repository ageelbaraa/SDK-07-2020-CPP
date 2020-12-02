package com.company.oop.Interface;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Animal lion = new Lion();
//        System.out.println(lion.toString());
//        Animal Penguin = new Penguin();
//        System.out.println(Penguin.toString());

        Animal someAnimal ;
        Random rand = new Random();

        switch (rand.nextInt(8)){
            case 1:{
                someAnimal = new Bird();
                someAnimal.Info();
            }break;

            case 2:{
                someAnimal = new Penguin();
                someAnimal.Info();
            }break;

            case 3:{
                someAnimal = new Falcon();
                someAnimal.Info();
            }break;

            case 4:{

                someAnimal = new Mammal();
                someAnimal.Info();
            }break;

            case 5:{
                someAnimal = new Lion();
                someAnimal.Info();
            }break;

            case 6:{
                someAnimal = new Bat();
                someAnimal.Info();
            }break;

            case 7:{
                someAnimal = new Bird();
                someAnimal.Info();
                someAnimal = new Penguin();
                someAnimal.Info();
                someAnimal = new Falcon();
                someAnimal.Info();
                someAnimal = new Mammal();
                someAnimal.Info();
                someAnimal = new Lion();
                someAnimal.Info();
                someAnimal = new Bat();
                someAnimal.Info();

            }break;


            default:{
               someAnimal = new Animal() {
                   @Override
                   public void Info() {
                       System.out.println("Animal");
                   }
               };
               someAnimal.Info();
            }break;
        }

    }
}
