package com.srinivas;

public class NotEat implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("I can't eat");
    }
}
