package Adapter;

public class Square implements SquareInterface{
    private double side;

    @Override
    public void setSide(double side){
        this.side= side;
    }

    @Override
    public double getSide(){
        return side;
    }

    @Override
    public double mensureSquareArea(){
        return side * side;
    }
}
