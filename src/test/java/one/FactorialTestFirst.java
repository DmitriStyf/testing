package one;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTestFirst {

    @Test
    public void whenCalculateFactorialPositiveIntegerReturnsResult() {
        assertEquals(120, FactorialFirst.factorialMethod(5));

    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialNegativeIntegerThrowException() {
        FactorialFirst.factorialMethod(-1);
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialZeroIntegerThrowsException() {
        FactorialFirst.factorialMethod(0);
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculatingFactorialBigInteger() {
        FactorialFirst.factorialMethod(25);
        //assertEquals(1409236455, FactorialFirst.factorialMethod(25));
    }
}