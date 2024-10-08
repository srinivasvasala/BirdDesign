package com.srinivas;


public class App 
{
    public static void main( String[] args )
    {
        Bird pigeon = new Penguin();
        pigeon.type();
        pigeon.color();
        pigeon.weight();
        pigeon.performFly();
        pigeon.performEat();
        pigeon.performMakeSound();
        pigeon.setEatBehaviour(new Eatable());
        pigeon.setFlyBehaviour(new flyNoWay());
        pigeon.setMakeSoundBehaviour(new makeSound());
    }
}
