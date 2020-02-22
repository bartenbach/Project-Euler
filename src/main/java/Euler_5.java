public class Euler_5 {

    public static int getSmallestEvenlyDivisibleNumber(int max) {
        int testNumber = 1;
        while (true) {
            if (isEvenlyDivisible(testNumber, max)) {
                return testNumber;
            }
            testNumber++;
        }
    }

    public static boolean isEvenlyDivisible(int x, int max) {
        for (int i = 1; i < max; i++) {
            if (x % i != 0) {
                return false;
            }
        }
        return true;
    }
}
