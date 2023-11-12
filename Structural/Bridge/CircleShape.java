package Bridge;

public class CircleShape extends Shape{
    private int x, y, radius;

    public CircleShape(int x, int y, int radius, DrawingAPI drawingAPI){
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(){
        drawingAPI.drawCircle(x, y, radius);
    }
}
