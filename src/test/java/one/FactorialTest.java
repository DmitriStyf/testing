package one;

import org.junit.Test;
import org.omg.SendingContext.RunTime;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialPositiveIntegerReturnsResult() {
        assertEquals(120, Factorial.factorialMethod(5));

    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialNegativeIntegerThrowException() {
        Factorial.factorialMethod(-1);
    }

    @Test(expected = RuntimeException.class)
    public void whenCalculateFactorialZeroIntegerThrowsException() {
        Factorial.factorialMethod(0);
    }

    @Test
    public void whenCalculatingFactorialBigInteger() {
        assertEquals(1409236455, Factorial.factorialMethod(25));
    }
}