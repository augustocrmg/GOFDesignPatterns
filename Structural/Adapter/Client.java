package Adapter;

public class Client {
    public static void main(String[] args) {
        // Using original retangle class
        RetangleInterface retangle = new Retangle(3, 2);
        System.err.println("Retangle area: "+retangle.mensureArea());

        // Using original square interface
        SquareInterface square = new Square();
        square.setSide(3);

        System.out.println("Square area: "+square);

        // Using the defined adapter
        RetangleInterface adaptedSquare = new SquareAdapter(square);
        System.out.println("Adapted square area: "+adaptedSquare);
    }
}
