package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Description: "+ simpleCoffee.getDescription());
        System.out.println("Cost: "+ simpleCoffee.cost());
        //System.out.println("\n");

        Coffee milkCoffee = new Milk(simpleCoffee);
        System.out.println("Description: "+ milkCoffee.getDescription());
        System.out.println("Cost: "+ milkCoffee.cost());
        //System.out.println("\n");

        Coffee sugarCoffee = new Sugar(milkCoffee);
        System.out.println("Description: "+ sugarCoffee.getDescription());
        System.out.println("Cost: "+ sugarCoffee.cost());
        //System.out.println("\n");

    }
}
