import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_10 {

    @Test
    public void testGetPrimeSummations() {
        Assert.assertEquals(17, Euler_10.getPrimeSummation(10));
    }

    @Test
    public void solveProblem() {
        System.out.println(Euler_10.getPrimeSummation(2000000));
    }


}
