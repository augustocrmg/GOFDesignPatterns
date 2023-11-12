package Decorator;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost(){
        return super.cost() + 2.0;
    }
}
