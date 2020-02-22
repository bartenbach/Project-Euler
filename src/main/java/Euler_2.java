import java.util.*;

public class Euler_2 {

    // int limit = 10
    //
    static int sum = 0;

    public static void main(String[] args) {
        generateFibonnaci(1, 1, 4000000);
        System.out.println(sum);
    }

    public static void generateFibonnaci(int x, int y, int limit) {
        if (y > limit) {
            return;
        }
        if (y % 2 == 0) {
            sum+=y;
        }
        System.out.println("(" + x + "," + y +  ")");
        int nextNum = x+y;
        generateFibonnaci(y, nextNum, limit);
    }

}
