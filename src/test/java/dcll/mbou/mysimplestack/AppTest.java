package dcll.mbou.mysimplestack;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    AppTest appTest;

    @Before
    public void setUp() throws Exception {
        appTest = new AppTest();

        System.out.println("Execute before each test main.");
    }

    @Test
    public void testMain() throws Exception {
        App.main(new String[]{});
    }


    @org.junit.Test
    public void testConstructorDefault(){
        App app = App.getObject();
    }

}
