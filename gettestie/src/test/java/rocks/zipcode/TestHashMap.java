package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {

    @Test
    public void testHashMap1(){
        HashMap<String, Integer> studentAges = new HashMap<String, Integer>();
        studentAges.put("Joshua", 22);
        studentAges.put("George", 26);
        int expected = 2;
        int actual = studentAges.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testHashMap2(){
        HashMap<String, Integer> studentAges = new HashMap<String, Integer>();
        studentAges.put("Joshua", 22);
        studentAges.put("George", 26);
        int expected = 26;
        int actual = studentAges.get("George");
        Assert.assertEquals(expected,actual);
    }

}
