package com.srinivas;

public class Eatable implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
