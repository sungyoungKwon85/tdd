package xpworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactor {
    // primeFactorOf2
    /*public static List<Integer> of (int number) {
        return Arrays.asList(2);
    }*/

    // primeFactorOf3 실패 후 리팩토링
    /*public static List<Integer> of (int number) {
        if (number == 3) {
            return Arrays.asList(3);
        }
        return Arrays.asList(2);
    }*/

    // primeFactorOf4 실패 후 리팩토링
    public static List<Integer> of (int number) {
        if (number == 4) {
            List<Integer> primes = new ArrayList<>();

            while (number % 2 == 0) {
                primes.add(2);
                number /= 2;
            }

            return primes;
        }

        if (number == 3) {
            return Arrays.asList(3);
        }
        return Arrays.asList(2);
    }

    // ......
}
