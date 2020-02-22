import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_7 {

    @Test
    public void testGetPrime() {
        Assert.assertEquals(13, Euler_7.getXthPrime(6));
    }

    @Test
    public void solveProblem() {
        System.out.println(Euler_7.getXthPrime(10001));
    }
}
