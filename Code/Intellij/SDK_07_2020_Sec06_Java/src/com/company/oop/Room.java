package com.company.oop;

public class Room {
    static String info;
    private int width, length, height;

    public Room() {
    }

    public Room(int width, int length, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

    int roomVolume() {
        return width * length * height;
    }

    int roomArea() {
        return width * length;
    }

    int roomVolume(int width, int length, int height) {
        return width * length * height;
    }

    int roomArea(int width, int length) {
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    static void info (){
        System.out.println(info);
    }
    public static void main(String[] args){
        Room room=new Room(5,8,9);
        System.out.println(room.roomVolume());
        System.out.println(room.roomArea());
        Room room2=new Room();
        System.out.println(room2.roomVolume(5,6,7));
        System.out.println(room2.roomArea(5,6));
        Room.info="12";
        Room.info();


    }
}