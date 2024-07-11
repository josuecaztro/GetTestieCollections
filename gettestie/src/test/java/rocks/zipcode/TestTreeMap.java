package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class TestTreeMap {

    @Test
    public void testTreeMap1(){
        TreeMap<String, Integer> library = new TreeMap<>();
        library.put("Zoey's Vacation", 10);
        library.put("Adam's Story", 5);
        String actual = library.firstKey();
        String expected = "Adam's Story";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testTreeMap2(){
        TreeMap<String, Integer> library = new TreeMap<>();
        library.put("Zoey's Vacation", 10);
        library.put("X Games", 12);
        library.put("Wonder Woman", 7);
        library.put("Adam's Story", 5);
        String actual = library.higherKey("Wonder Woman");
        String expected = "X Games";
        Assert.assertEquals(actual,expected);
    }

}
