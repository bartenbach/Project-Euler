import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_7 {

    @Test
    public void testGetPrime() {
        Assert.assertEquals(13, Euler_7.getXthPrime(6));
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(Euler_7.isPrime(2));
        Assert.assertTrue(Euler_7.isPrime(3));
        Assert.assertTrue(Euler_7.isPrime(7));
    }

    @Test
    public void solveProblem() {
        System.out.println(Euler_7.getXthPrime(10001));
    }
}
