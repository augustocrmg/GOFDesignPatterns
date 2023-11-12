package Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Simple coffee";
    }

    @Override
    public double cost(){
        return 5.0;
    }
}