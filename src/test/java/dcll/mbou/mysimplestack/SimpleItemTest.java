package dcll.mbou.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleItemTest {

    SimpleItem simpIt;

    @Before
    public void setUp() throws Exception {
        simpIt = new SimpleItem();
        System.out.println("Execute before each test of SimpleItem.");
    }

    @Test
    public void testGetObj() throws Exception {
        //
    }

    @Test
    public void testSetObj() throws Exception {
        simpIt.setObj(new Integer(8));
        Integer integer = (Integer)simpIt.getObj();
        Assert.assertEquals(8, integer.intValue());
    }
}