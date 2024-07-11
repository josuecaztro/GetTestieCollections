package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TestLinkedList {

    @Test
    public void testLinkedList1(){
        LinkedList<Integer> scores = new LinkedList<Integer>();
        scores.add(5);
        scores.add(2);
        scores.add(10);
        int actual = scores.getFirst();
        int expected = 5;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testLinkedList2(){
        LinkedList<Integer> scores = new LinkedList<Integer>();
        scores.add(5);
        scores.add(2);
        scores.add(10);
        scores.removeLast();
        boolean actual = scores.contains(10);
        Assert.assertFalse(actual);
    }

}
