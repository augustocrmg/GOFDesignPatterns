package Adapter;

public class Retangle implements RetangleInterface{
    private double length;
    private double width;

    public Retangle(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }

    @Override
    public double mensureArea(){
        return length * width;  
    }
}
