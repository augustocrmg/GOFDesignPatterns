package Flyweight;
import java.util.Map;
import java.awt.Color;
import java.util.HashMap;

public class ShapeFactory {
    private static final Map<Color, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Criando um círuclo com a cor: "+color);
        }
        return circle;
    }
}
