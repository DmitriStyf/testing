package mockito.methods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doAnswer;

@RunWith(MockitoJUnitRunner.class)
public class ListExample {

    @Test
    public void testMockWithAnswer() {
        List<String> listMock = Mockito.mock(ArrayList.class);
        doAnswer(invocation ->"Always the same").when(listMock).get(anyInt());

        String element = listMock.get(1);
        assertThat(element, is(equalTo("Always the same")));

    }
}
