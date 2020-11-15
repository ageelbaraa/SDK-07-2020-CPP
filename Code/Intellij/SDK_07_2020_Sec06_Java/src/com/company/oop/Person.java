package com.company.oop;

public class Person {

    private int Id;
    private String Name;
    private String Gender;

    public Person(){}

    public Person(int id,String name , String gender){
        this.Id = id;
        this.Name = name;
        this.Gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void Print(){
        System.out.println("Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setId(123);
        person.setName("Ali Ahmad");
        person.setGender("Male");
        System.out.println(person.toString());
        person = new Person(124,"Oyku","Female");
        System.out.println(person.toString());

    }
}
