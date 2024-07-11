package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class TestIterator {


    @Test
    public void testIterator1 (){
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Will");
        names.add("Brian");
        Iterator<String> iterator = names.iterator();
        String actual = null;
        while (iterator.hasNext()){
            String i = iterator.next();
            if (i.equals("Will")){
                actual = i;
            }
        }
        String expected = names.get(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIterator2 (){
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Will");
        names.add("Brian");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String i = iterator.next();
            if (i.equals("Will")){
                iterator.remove();
            }
        }
        String actual = names.get(1);
        String expected = "Brian";
        Assert.assertEquals(actual, expected);
    }
}
