package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class TestVector {

    @Test
    public void testVector1 (){
        Vector<Integer> myVector = new Vector<>(15);
        int expected = 15;
        int actual = myVector.capacity();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testVector2 (){
        //This one took a while to understand but basically the initial capacity
        //Will always double even if the new min capacity isn't that high. its for efficiency reasons.
        Vector<Integer> myVector = new Vector<>(5);
        myVector.ensureCapacity(7);
        int expected = 10;
        int actual = myVector.capacity();
        Assert.assertEquals(expected,actual);
    }

}
