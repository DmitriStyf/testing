package mockito.annotation;

import one.CalcTest;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    @Mock
    CalcTest calcTest;

    CalcTest calcTest1 = mock(CalcTest.class);

    @Before
    public void init() {

        MockitoAnnotations.initMocks(this);

    }
}
