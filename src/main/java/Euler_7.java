public class Euler_7 {

    public static int getXthPrime(int input) {
        int counter = 0;
        int current = 1;
        while (true) {
            if (isPrime(current)) {
                if (counter == input) {
                    return current;
                }
                counter++;
            }
            current++;
        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
