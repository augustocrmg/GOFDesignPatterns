package Flyweight;
import java.awt.Color;

public class Circle implements Shape{
    private Color color;

    public Circle(Color color){
        this.color = color;
    }

    @Override
    public void draw(int x, int y){
        System.out.println("Desenhando um círculo colorido em (" + x + ", " + y + ") com cor " + color);
    }
}
