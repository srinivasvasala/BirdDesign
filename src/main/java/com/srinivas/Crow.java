package com.srinivas;

public class Crow extends Bird{

    public Crow(){
        flyBehaviour = new flyWithWings();
        makeSoundBehaviour = new makeSound();
        eatBehaviour = new Eatable();
    }
    @Override
    public void type() {
        System.out.println("I am crow");
    }

    @Override
    public void color() {
        System.out.println("I am black");
    }

    @Override
    public void weight() {
        System.out.println("My weigh 0.3 kg");
    }
}
