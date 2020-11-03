package com.company.oop;

public class Board {
    String info; // access modifier is default
    private int width , height;

    public Board(){}
    public Board(int width , int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int boardArea(){
        return this.width * this.height;
    }

    public static void main(String[] args){
        Board board = new Board(5,7);
        System.out.println("The area of board is " + board.boardArea());
        Board board2 = new Board();
        board2.setHeight(3);
        board2.setWidth(5);
        System.out.println("The area of board is " + board2.boardArea());


    }
}

