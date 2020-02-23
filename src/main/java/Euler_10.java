public class Euler_10 {

    public static long getPrimeSummation(long x) {
        long total = 0;
        for (long i = 2; i < x; i++) {
            if (isPrime(i)) {
                total+=i;
            }
        }
        return total;
    }

    public static boolean isPrime(long x) {
        for (long i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
