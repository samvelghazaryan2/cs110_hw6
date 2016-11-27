import com.shape.*;
import com.utils.Math;
public class Driver{
    public static void main(String[] args) {
        int sideLenght = 100;    //Square
        int width = 50;          //Rectangle
        int height = 30;
        double number1 = 15.6;   //Factorial(Recursion)
        double number2 = 6.8;    //Factorial(ForLoop)
        Square sq = new Square(sideLenght);
        long SquareArea = sq.getArea();
        System.out.println("Area of Square with side lenght of "+ sideLenght +" equals to "+SquareArea);
        Rectangle rec = new Rectangle(width,height);
        long RectangleArea = rec.getArea();
        System.out.println("Area of Rectangle with width of "+ width +" and height of "+ height +" equals to " +RectangleArea);
        System.out.println("Factorial of integer part of "+ number1 +" is " + Math.factorial(number1));
        System.out.println("Factorial of integer part of "+ number2 +" is " + Math.factorialLoop(number2));
    }
}