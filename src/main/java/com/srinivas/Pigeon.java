package com.srinivas;

public class Pigeon extends Bird {
   public Pigeon(){
    flyBehaviour = new flyWithWings();
    eatBehaviour = new Eatable();
    makeSoundBehaviour = new makeSound();
    }

    @Override
    public void type() {
        System.out.println("I am pigeon");
    }

    @Override
    public void color() {
        System.out.println("I am blue");
    }

    @Override
    public void weight() {
        System.out.println("My weigh 0.3 kg");

    }
}
