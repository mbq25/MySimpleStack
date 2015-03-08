package dcll.mbou.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStack();
        System.out.println("Execute before each test of SimpleStack.");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        SimpleItem newIt = new SimpleItem();
        simpleStack.push(newIt);
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String elnt = "Toto";
        simpleStack.push(new SimpleItem(elnt));
        simpleStack.push(new SimpleItem(elnt+"2"));
        // la taille doit augmenter de 2
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        SimpleItem newIt = new SimpleItem();
        simpleStack.push(newIt);
        Assert.assertEquals(1, simpleStack.getSize());
    }

    @Test
    public void testPeek() throws Exception {
        SimpleItem newIt1 = new SimpleItem(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(newIt1);
        Assert.assertEquals(1,simpleStack.getSize());
        SimpleItem newIt2 = simpleStack.peek();
        // ne doit pas retirer l'objet de la pile
        Assert.assertEquals(1,simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(newIt2.getObj() instanceof Integer);
        Integer integer = (Integer)newIt2.getObj();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(newIt1.getObj(),integer);
    }

    @Test
    public void testPop() throws Exception {
        SimpleItem it1 = new SimpleItem(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(it1);
        Assert.assertEquals(1,simpleStack.getSize());
        SimpleItem itPop = simpleStack.pop();
        // on doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(itPop.getObj() instanceof Integer);
        Integer integer = (Integer)itPop.getObj();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(it1.getObj(), integer);
    }
}