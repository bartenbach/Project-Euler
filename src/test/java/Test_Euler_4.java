import org.junit.Assert;
import org.junit.Test;

public class Test_Euler_4 {

    @Test
    public void testGetLargestPalindromeNumber() {
        // 91 x 99
        Assert.assertEquals(9009, Euler_4.getLargestPalindromeNumber(99));
        System.out.println(Euler_4.getLargestPalindromeNumber(999));
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(Euler_4.isPalindrome("racecar"));
        Assert.assertTrue(Euler_4.isPalindrome("poop"));
        Assert.assertTrue(Euler_4.isPalindrome("anna"));
        Assert.assertFalse(Euler_4.isPalindrome("eggs"));
        Assert.assertFalse(Euler_4.isPalindrome("bacon"));
        Assert.assertFalse(Euler_4.isPalindrome("hackdogg"));
    }
}
