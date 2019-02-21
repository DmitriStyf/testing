package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTest {

    @Test
    public void whenNumber1ThenFizzBuzzer1() {
        int input = 1;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"1");
    }

    @Test
    public void whenNumber2ThenFizzBuzzer2() {
        int input = 2;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"2");
    }

    @Test
    public void whenNumber3ThenFizzBuzzerFizz() {
        int input = 3;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"Fizz");
    }

    @Test
    public void whenNumber5ThenFizzBuzzerBuzz() {
        int input = 5;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"Buzz");
    }

    @Test
    public void whenNumber6ThenFizzBuzzerFizz() {
        int input = 6;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"Fizz");
    }

    @Test
    public void whenNumber10ThenFizzBuzzerBuzz() {
        int input = 10;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"Buzz");
    }

    @Test
    public void whenNumber15ThenFizzBuzzerFizzBuzz() {
        int input = 15;
        String expected = FizzBuzzer.getValue(input);
        assertEquals(expected,"FizzBuzz");
    }



}
