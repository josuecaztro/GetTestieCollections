package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestSet {

    @Test
    public void testSet1 (){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Tesla");
        boolean actual = cars.contains("Tesla");
        Assert.assertTrue(actual);
    }

    @Test
    public void testSet2 (){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.remove("Tesla");
        boolean actual = cars.contains("Tesla");
        Assert.assertFalse(actual);
    }

    @Test
    public void testSet3 (){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.clear();
        int actual = cars.size();
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

}
