public class Euler_9 {

    public static void getPythagoreanTriplet() {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    if (Math.pow(i,2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        //System.out.println("Pythagorean works: " + i + "² + " + j + "² = " + k + "²");
                        if (i < j && j < k) {
                            //System.out.println("Pythagorean triplet ^");
                            if (i+j+k == 1000) {
                                System.out.println("Found special pythagorean triplet!");
                                System.out.println("Product is: " + i*j*k);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
