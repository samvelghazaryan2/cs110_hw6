package utils;

public class Math {


    public static int factorial(double a) {
        int i = (int) a ;
        if (i == 1) return 1;
        else return factorial(i - 1) * i;
    }

    public static int factorialLoop(double a) {
        int num = (int) a ;
        int result = 1;
        if (num == 1) {
            return 1;
        }
        else {
            for (int i = num; i > 0; i--) {
                result = result * i;

            }

            return result;
        }

    }


}