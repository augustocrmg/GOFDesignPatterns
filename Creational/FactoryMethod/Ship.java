package FactoryMethod;

public class Ship implements Vehicle{
    private int weightTonsCapacity;

    @Override
    public void accelerate(){
        System.out.println("Ship status: accelerating");
    }

    @Override
    public void brake(){
        System.out.println("Ship status: braking");
    }

    public void anchor(){
        System.out.println("Ship status: anchoring");
    }

    public void setWeightTonsCapacity(int tons){
        this.weightTonsCapacity = tons;
    }

    public void getWeightTonsCapacity(){
        System.out.println("Weight carrying capacity: "+weightTonsCapacity);
    }
}
