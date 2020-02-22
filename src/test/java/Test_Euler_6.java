import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_6 {

    @Test
    public void testSumOfSquares() {
        Assert.assertEquals(385, Euler_6.getSumOfSquares(10));
    }

    @Test
    public void testSquareOfSums() {
        Assert.assertEquals(3025, Euler_6.getSquareOfSums(10));
    }

    @Test
    public void testDifferenceBetweenSumOfSquaresAndSquareOfSums() {
        Assert.assertEquals(2640, Euler_6.getDifferenceBetweenSumOfSquaresAndSquareOfSums(10));
    }

    @Test
    public void solveProblem() {
        System.out.println(Euler_6.getDifferenceBetweenSumOfSquaresAndSquareOfSums(100));
    }
}
