package mockito.methods;


import one.CalcTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockitoTest {

    @Mock
    CalcTest calcTest;

    @Test
    public void testAddWithPositiveIntegerReturnResult(){
        when(calcTest.add(3,5)).thenReturn(8);
    }

    @Test
    public void testAddWithNegativeIntegerReturnResult() {
        when(calcTest.add(-3,-5)).thenReturn(-8);
    }

    @Test
    public void testAddWithAnyIntegerReturnAny() {
        when(calcTest.add(anyInt(), anyInt())).thenReturn(120);
    }
}
