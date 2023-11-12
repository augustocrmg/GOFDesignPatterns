package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        DrawingAPI api1 = new DrawingAPI1();
        DrawingAPI2 api2 = new DrawingAPI2();

        Shape circle1 = new CircleShape(1, 2, 3, api1);
        Shape circle2 = new CircleShape(5, 7, 11, api2);

        circle1.draw();
        circle2.draw();
    }
}
