package xpworks;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PrimeFactorTest {

    @Test
    public void primeFactorOf2() {
        assertEquals(Arrays.asList(2), PrimeFactor.of(2));
    }

    @Test
    public void primeFactorOf3() {
        assertEquals(Arrays.asList(3), PrimeFactor.of(3));
    }

    @Test
    public void primeFactorOf4() {
        assertEquals(Arrays.asList(2, 2), PrimeFactor.of(4));
    }

    @Test
    public void primeFactorOf5() {
        assertEquals(Arrays.asList(2, 2), PrimeFactor.of(4));
    }
}