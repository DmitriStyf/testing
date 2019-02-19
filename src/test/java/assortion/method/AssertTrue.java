package assortion.method;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class AssertTrue {

    @Test
    public void shouldAssertTrueThrowAssertionError() {
        assertFalse(5==6);
    }

    @Test
    public void shouldAssertTruePass() {
        assertTrue(2==2);
        assertTrue("My name".equals(new String("Me name")));


    }
}
