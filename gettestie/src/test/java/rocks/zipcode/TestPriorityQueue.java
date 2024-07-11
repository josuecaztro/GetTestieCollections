package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class TestPriorityQueue {

    @Test
    public void testPriorityQueue1 (){
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        numberQueue.add(18);
        numberQueue.add(6);
        numberQueue.add(1);
        numberQueue.poll();
        Integer actual = numberQueue.peek();
        Integer expected = 6;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPriorityQueue2 (){
        PriorityQueue<Integer> numberQueue = new PriorityQueue<>();
        numberQueue.add(18);
        numberQueue.add(6);
        numberQueue.add(1);
        numberQueue.remove(6);
        boolean actual = numberQueue.contains(6);
        Assert.assertFalse(actual);
    }

}
