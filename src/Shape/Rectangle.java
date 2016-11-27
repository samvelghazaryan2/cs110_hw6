package Shape;

public class Rectangle{
    private long RectangleWidth;
    private long RectangleHeight;
    public Rectangle(long a, long b){
        this.RectangleWidth = a;
        this.RectangleHeight = b;
    }
    public long getArea() {
        long result = RectangleWidth*RectangleHeight;
        return result;
    }
}