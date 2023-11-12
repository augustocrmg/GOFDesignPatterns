package Adapter;

public class SquareAdapter implements RetangleInterface{
    private SquareInterface square;

    public SquareAdapter(SquareInterface square){
        this.square = square;
    }

    @Override
    public double mensureArea(){
        return square.mensureSquareArea();
    }
}
