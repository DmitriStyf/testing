package assortion.exeption;

import one.CalcTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

public class CalculatorTest {

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingBy() {
        // given
        CalcTest calcTest = new CalcTest();
        int number = new Random().nextInt();
        //when
        calcTest.divide(number, 0);
        //then
        //should throw exception
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        Object nullObject = null;
        nullObject.equals(new Object());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowExceptionWhenDividingBy0_2(){

        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        //given

        CalcTest calcTest = new CalcTest();
        int number = new Random().nextInt();
        // when

        calcTest.divide(number,0);
        // then
        // should throw exception
    }


}
