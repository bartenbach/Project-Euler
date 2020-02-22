public class Euler_4 {

    public static int getLargestPalindromeNumber(int factor) {
        int largestPalindrome = 0;
        for (int i = 1; i < factor; i++) {
            for (int j = 1; j < factor; j++) {
                //System.out.println(j + " * " + i + " = " + j*i);
                if (isPalindrome(String.valueOf(j*i))) {
                    if (j*i > largestPalindrome) {
                        largestPalindrome = j*i;
                    }
                }
            }
        }
        return largestPalindrome;
    }

    public static boolean isPalindrome(String x) {
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString().equalsIgnoreCase(x);
    }
}
