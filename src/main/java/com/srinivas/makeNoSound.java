package com.srinivas;

public class makeNoSound implements MakeSoundBehaviour{
    @Override
    public void makeSound() {
        System.out.println("I can't make sound");
    }
}
