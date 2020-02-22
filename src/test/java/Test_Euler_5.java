import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_5 {

    @Test
    public void testBaseCase() {
        //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        //Assert.assertEquals(2520, Euler_5.getSmallestEvenlyDivisibleNumber(10));
        System.out.println(Euler_5.getSmallestEvenlyDivisibleNumber(20));
    }
}
