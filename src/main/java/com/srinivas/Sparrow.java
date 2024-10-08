package com.srinivas;

public class Sparrow extends Bird{

    public Sparrow(){
        flyBehaviour = new flyWithWings();
        eatBehaviour = new Eatable();
        makeSoundBehaviour = new makeSound();
    }
    @Override
    public void type() {
        System.out.println("I am sparrow");
    }

    @Override
    public void color() {
        System.out.println("I am black");
    }

    @Override
    public void weight() {
        System.out.println("My weigh 0.1 kg");
    }
}
