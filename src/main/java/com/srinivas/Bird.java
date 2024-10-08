package com.srinivas;

public abstract class Bird {
     FlyBehaviour flyBehaviour;
     EatBehaviour eatBehaviour;
     MakeSoundBehaviour makeSoundBehaviour;
     public abstract void type();
     public abstract void color() ;
     public abstract void weight() ;

     public void performFly() {
         flyBehaviour.fly();
     }
     public void performEat() {
         eatBehaviour.eat();
     }
     public void performMakeSound() {
         makeSoundBehaviour.makeSound();
     }

     public void setFlyBehaviour(FlyBehaviour fb) {
         flyBehaviour = fb;
     }
     public void setEatBehaviour(EatBehaviour eb) {
         eatBehaviour = eb;
     }
     public void setMakeSoundBehaviour(MakeSoundBehaviour msb) {
         makeSoundBehaviour = msb;
     }

}
