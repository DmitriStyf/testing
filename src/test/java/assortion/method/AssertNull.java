package assortion.method;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;

public class AssertNull {

    @Test
    public void whenAssetNullThenNull() {

        Object object = null;
        assertNull(object);
    }
}
