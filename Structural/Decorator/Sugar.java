package Decorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double cost(){
        return super.cost() + 0.5;
    }
}
