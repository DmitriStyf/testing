package assortion.method;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AssertEquals {

    @Test
    public void whenAssertingEquality_thenEqual() {
        String expected = "Feride";
        String actual = new String("Feride"); // odno i to zhe

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAssertEqualsPass() {
        assertEquals(64, 2 * 32);

    }

    @Test
    public void whenAssertEqualsAssertingErrorWithComment() {

        assertEquals("Value are not equal", 1, 2);
    }
}

