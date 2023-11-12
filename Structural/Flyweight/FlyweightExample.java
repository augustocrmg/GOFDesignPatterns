package Flyweight;

import java.awt.Color;

public class FlyweightExample {
    public static void main(String[] args) {
        for (int i=0;i < 5;i++){
            Shape redCircle = ShapeFactory.getCircle(Color.RED);
            redCircle.draw(i*2, i*2);

            Shape greenCircle = ShapeFactory.getCircle(Color.GREEN);
            greenCircle.draw(i*3, i*3);
        }
    }
}
