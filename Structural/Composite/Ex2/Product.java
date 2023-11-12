package Composite.Ex2;

public class Product implements Component{
    private double value;
    private String name;

    public Product(String name,double value){
        this.value = value;
        this.name = name;
    }

    @Override
    public double calcValue(){
        return value;
    }

    @Override
    public String toString(){
        return "- Product: "+ name + "\n- Value: "+ value;
    }

}
