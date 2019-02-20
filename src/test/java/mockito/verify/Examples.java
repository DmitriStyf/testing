package mockito.verify;

import one.CalcTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Examples {

    @Mock
    CalcTest calcTest;

    @Mock
    List<String> mockedList;

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
        mockedList.add("one");
        verify(mockedList).add("one");
        assertEquals(0,mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100);
        assertEquals(100,mockedList.size());

    }

    @Test
    public void testAddVerify() {
        calcTest.add(anyInt(), anyInt());
        verify(calcTest).add(anyInt(),anyInt());

    }

    @Test
    public void testAddVerifyTimes() {
        calcTest.add(anyInt(),anyInt());
        verify(calcTest, times(1)).add(anyInt(),anyInt());

    }

    @Test
    public void testVerifyWithList() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        verify(mockedList).size();
    }

    @Test
    public void testVerifyWithZeroInteractions() {
        List<String> mockedList = mock(ArrayList.class);
        verifyZeroInteractions(mockedList);
        verify(mockedList, times(0)).size();
    }

    @Test
    public void testVerifyWithUnexpectedInteruptions() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        mockedList.clear();
        verify(mockedList).size();
        verifyNoMoreInteractions(mockedList);
    }

    @Test
    public void testVerifyOrderedCalls() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        mockedList.add("one");
        mockedList.clear();

        InOrder inOrder = Mockito.inOrder(mockedList);
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedList).add("one");
        inOrder.verify(mockedList).clear();
    }

    @Test
    public void testVerifyNoInteraction() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.size();
        verify(mockedList, never()).clear();
    }

    @Test
    public void testVerifyAtLeastAtMost() {
        List<String> mockedList = mock(ArrayList.class);
        mockedList.clear();
        mockedList.clear();
        mockedList.clear();

        verify(mockedList, atLeast(1)).clear();
        verify(mockedList, atMost(10)).clear();
    }


}

