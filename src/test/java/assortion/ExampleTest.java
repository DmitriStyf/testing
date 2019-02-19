package assortion;

import one.CalcTest;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class ExampleTest {

    @Test
    public void nameME() {
        assertTrue(true);
    }

    @Test
    public void test() {
        CalcTest calcTest = new CalcTest();

        int result = calcTest.add(5, 3);
        // assertTrue( 5 == 9);
        assert result == 9 || result == 8;
        assertEquals(64, 2 * 32);
    }

    @Test
    public void shouldAssertTrueThrowAssertionError() {
        assertTrue( 5==5);
       // assertFalse(5==6);

//        assertNull(object);
//        assertSame(object1,object2);

    }

    @Test
    public void sametest() {
        Integer one = 1;
        Integer two = 1;

        assertSame(one,two);

    }
}