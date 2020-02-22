import java.util.ArrayList;
import java.util.List;

public class Euler_3 {

    public static List<Long> getPrimeFactors(long input) {
        List<Long> primeFactors = new ArrayList<>();
        for (long i = 2; i < input; i++) {
            if (input % i == 0) {
                primeFactors.add(i);
                input/=i;
            }
        }
        primeFactors.add(input);
        return primeFactors;
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
