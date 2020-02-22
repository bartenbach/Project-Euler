public class Euler_6 {

    public static int getSumOfSquares(int x) {
        int sum = 0;
        for (int i = 1; i < x+1; i++) {
            sum+=Math.pow(i,2);
        }
        return sum;
    }

    public static int getSquareOfSums(int x) {
        int sum = 0;
        for (int i = 1; i < x+1; i++){
            sum+=i;
        }
        return (int) Math.pow(sum, 2);
    }

    public static int getDifferenceBetweenSumOfSquaresAndSquareOfSums(int x) {
        return getSquareOfSums(x) - getSumOfSquares(x);
    }
}
