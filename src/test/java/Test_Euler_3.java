import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_Euler_3 {

    @Test
    public void testIsPrime() {
        Assert.assertTrue(Euler_3.isPrime(2));
        Assert.assertTrue(Euler_3.isPrime(5));
        Assert.assertTrue(Euler_3.isPrime(7));
        Assert.assertTrue(Euler_3.isPrime(13));

        Assert.assertFalse(Euler_3.isPrime(4));
        Assert.assertFalse(Euler_3.isPrime(8));
        Assert.assertFalse(Euler_3.isPrime(9));
        Assert.assertFalse(Euler_3.isPrime(12));
    }

    @Test
    public void testGetPrimeFactors() {
        List<Long> factors = new ArrayList<>();
        factors.add(3L);
        factors.add(7L);
        factors.add(7L);
        List<Long> actualFactors = Euler_3.getPrimeFactors(147L);
        Assert.assertArrayEquals(factors.toArray(), actualFactors.toArray());

        List<Long> factors2 = new ArrayList<>();
        factors2.add(2L);
        factors2.add(3L);
        factors2.add(2L);
        List<Long> actualFactors2 = Euler_3.getPrimeFactors(12L);
        Assert.assertArrayEquals(factors2.toArray(), actualFactors2.toArray());

        List<Long> factors3 = new ArrayList<>();
        factors3.add(17L);
        List<Long> actualFactors3 = Euler_3.getPrimeFactors(17L);
        Assert.assertArrayEquals(factors3.toArray(), actualFactors3.toArray());

        List<Long> actualFactors4 = Euler_3.getPrimeFactors(600851475143L);
        System.out.println(actualFactors4);
    }
}
