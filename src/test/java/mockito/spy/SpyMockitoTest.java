package mockito.spy;

import one.CalcTest;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyMockitoTest {

    @Test
    public void testListAllWithMock() {
        CalcTest calcTest = new CalcTest();
        CalcTest spyCalculator = spy(calcTest);
        spyCalculator.add(4,6);
        spyCalculator.add(3,4);
        Mockito.verify(spyCalculator).add(4,6);
        Mockito.verify(spyCalculator).add(3,4);
    }

    @Test(expected = NullPointerException.class)
    public void testSpyWithMockBehaviour() {
        List<String> instance = new ArrayList<>();
        List<String> spy = Mockito.spy(instance);
        doThrow(NullPointerException.class).when(spy).size();
        spy.size(); // will throw the exception
    }

    //difference from mock and spy

    @Test
    public void testLstAllWithMock() {
        List<String> mockedList = mock(ArrayList.class);

        mockedList.add("one");
        Mockito.verify(mockedList).add("one");

        assertEquals(0, mockedList.size());
    }

    @Test
    public void testListAllWithSpy() {
        List spyList = Mockito.spy( new ArrayList());

        spyList.add("one");
        Mockito.verify(spyList).add("one");

        assertEquals(1, spyList.size());
    }
}