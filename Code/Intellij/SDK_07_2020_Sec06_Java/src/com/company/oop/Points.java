package com.company.oop;

public class Points {
    // Access Modifier in Java
    // 1. public
    // 2. default
    // 3. protected
    // 4. private

    int distance; // by default public
    private int x1 , x2 , y1 , y2;
    static String info;

    public Points(int x1 , int x2 , int y1 , int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Points(){}



    double distanceBetweenTowPoint(){
        return Math.pow((Math.pow(this.x2-this.x1,2) + Math.pow(this.y2 - this.y1,2)),0.5);
    }

    static void info(){
        System.out.println("This Is Points Class!! " + info);
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public static void main(String[] args) {
        Points.info = "Filled in static mode";
        Points.info();
        //Points points = new Points(10,5,3,4);
        Points points = new Points();
        points.setX1(4);
        points.setX2(6);
        points.setY1(9);
        points.setY2(3);

        System.out.println("The Distance Between Tow Point is : " + points.distanceBetweenTowPoint() );

    }
}







