package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenNumber1ThenReturns1() {
        int input = 1;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected, 1);
    }

    @Test
    public void whenNumber2ThenReturns2(){
        int input = 2;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected,2);
    }

    @Test
    public void whenNumber3ThenReturns3(){
        int input = 3;
        int expected = Factorial.getFactorialNumber(input);
        assertEquals(expected,6);
    }

    @Test
    public void whenNumber3ThenReturns3WithMap(){
        int input = 3;
        int expected = Factorial.getFactorialNumberWithMap(input);
        assertEquals(expected,6);
    }
}