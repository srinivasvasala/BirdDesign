package com.srinivas;

public class Penguin extends Bird {

    public Penguin(){
        flyBehaviour = new flyNoWay();
        makeSoundBehaviour = new makeSound() ;
        eatBehaviour = new Eatable();
    }
    @Override
    public void type() {
        System.out.println("I am penguin");
    }

    @Override
    public void color() {
        System.out.println("I am white");
    }

    @Override
    public void weight() {
        System.out.println("My weigh 10 kg");
    }
}
