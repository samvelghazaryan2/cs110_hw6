package Shape;

public class Square{
    private long squareWidth;
    public Square(long a){
        this.squareWidth = a;
    }
    public long getArea() {
        long result = squareWidth*squareWidth;
        return result;
    }
}