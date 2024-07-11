package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class arrayDeque {

    @Test
    public void arrayDeque1(){
        ArrayDeque<String> inviteList = new ArrayDeque<>();
        inviteList.add("John");
        inviteList.add("Will");
        inviteList.add("Peter");
        inviteList.offerLast("Daisy");
        String actual = inviteList.peekLast();
        String expected = "Daisy";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void arrayDeque2(){
        ArrayDeque<String> inviteList = new ArrayDeque<>();
        inviteList.add("John");
        inviteList.add("Will");
        inviteList.add("Peter");
        inviteList.add("Daisy");
        inviteList.pollFirst();
        String actual = inviteList.peekFirst();
        String expected = "Will";
        Assert.assertEquals(actual,expected);
    }
}
