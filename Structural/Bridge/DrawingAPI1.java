package Bridge;

public class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(int x, int y, int radius){
        System.out.printf("API1 draw a circle in (%d, %d) pos with %d%n radius", x, y, radius);
    }
}
