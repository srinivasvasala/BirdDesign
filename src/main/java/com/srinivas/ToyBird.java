package com.srinivas;

public class ToyBird extends Bird{
    public ToyBird(){
        flyBehaviour = new flyNoWay();
        eatBehaviour = new NotEat();
        makeSoundBehaviour = new makeSound();
    }
    @Override
    public void type() {
        System.out.println("I am toy bird");
    }

    @Override
    public void color() {
        System.out.println("I am yellow");
    }

    @Override
    public void weight() {
        System.out.println("My weigh 0.1 kg");
    }
}
