package FactoryMethod;

public class Car implements Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Car status: Accelerating");
    }

    @Override
    public void brake(){
        System.out.println("Car status: Braking");
    }

    public void enableNitro(){
        System.out.println("Car status: Enabling nitro");
    }
}
