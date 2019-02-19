package assortion.lifeCycle;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;

public class JUnitLifeCycle {

    @Before
    public void setUp() throws Exception {
        System.out.println("Run before each test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Run after each test");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Run before first test method test");
    }

    @AfterClass
    public  static void tearDownBeforeClass() throws Exception {
        System.out.println("Run after last test method");
    }

    @Test
    public void nameМетралала() {
        assertTrue(true);
    }

    @Test
    public void assertEquals() {

    }
}
