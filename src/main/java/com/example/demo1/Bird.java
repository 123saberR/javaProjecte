package com.example.demo1;

public class Bird implements  Animals{
    @Override
    public  void move(){
        System.out.println( "ana 9t");

    }

    @Override
    public void makeSound() {
        System.out.println("myaw ");

    }

    public static void main(String[] args) {
        Bird brid = new Bird();
        brid.move();
    }


}
