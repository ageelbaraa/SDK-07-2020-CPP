package com.company.oop;

public class Points {
    // Access Modifier in Java
    // 1. public
    // 2. default
    // 3. protected
    // 4. private

    int distance; // by default public
    private int x1 , x2 , y1 , y2;

    public Points(int x1 , int x2 , int y1 , int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    double distanceBetweenTowPoint(){
        return Math.pow((Math.pow(this.x2-this.x1,2) + Math.pow(this.y2 - this.y1,2)),0.5);
    }

    public static void main(String[] args) {
        Points points = new Points(10,5,3,4);
        System.out.println("The Distance Between Tow Point is : " + points.distanceBetweenTowPoint() );
    }
}


