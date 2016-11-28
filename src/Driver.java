import com.shape.*;
import com.utils.Math;
public class Driver{
    public static void main(String[] args) {
        int sideLenght = 100;    
        int w = 50;         
        int h = 80;
        double f1 = 15.6;   
        double f2 = 6.8;    
        Square s = new Square(sideLenght);
        long SquareArea = s.getArea();
        System.out.println(SquareArea);
        Rectangle r = new Rectangle(w,h);
        long RectangleArea = r.getArea();
        System.out.println(RectangleArea);
        System.out.println(Math.factorial(f1));
        System.out.println(Math.factorialLoop(f2));
    }
}
