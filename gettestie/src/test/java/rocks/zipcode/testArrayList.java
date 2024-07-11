package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class testArrayList {


    @Test
    public void testArrayList1 (){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Kangaroo");
        animals.add("Hippo");
        String actual = animals.get(1);
        String expected = "Hippo";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testArrayList2 (){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Kangaroo");
        animals.add("Hippo");
        animals.set(0, "Rabbit");
        String actual = animals.get(0);
        String expected = "Rabbit";
        Assert.assertEquals(actual,expected);
    }

}
