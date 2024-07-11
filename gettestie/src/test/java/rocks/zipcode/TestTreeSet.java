package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestTreeSet {

    @Test
    public void testTreeSet (){
        TreeSet<Integer> myInts = new TreeSet<>();
        myInts.add(7);
        myInts.add(9);
        myInts.add(2);
        Integer actual = myInts.lower(7);
        Integer expected= 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testTreeSet1 (){
        TreeSet<Integer> myInts = new TreeSet<>();
        myInts.add(1);
        myInts.add(9);
        myInts.add(2);
        Integer actual = myInts.first();
        Integer expected= 1;
        Assert.assertEquals(actual,expected);
    }

}
