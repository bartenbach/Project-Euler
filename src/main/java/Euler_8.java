public class Euler_8 {

    /**
     *
     * @param number - String, the massive number in string form
     * @param digits how many digits to check for the largest adjacent product
     * @return The largest product of "digits" length that occurs in "number"
     */
    public static long getLargestConsecutiveProduct(String number, int digits) {
        int index = 0;
        long largestProduct = 0L;
        while (index+digits < number.length()+1) {
            String sub = number.substring(index, index+digits);
            long product = 1L;
            for (char x : sub.toCharArray()) {
                product*=Integer.parseInt(String.valueOf(x));
            }
            if (product > largestProduct) {
                largestProduct = product;
            }
            index++;
        }
        return largestProduct;
    }
}
