package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.pop();
        stack.push("This is now here.");
        String actual = stack.peek();
        String expected = "This is now here.";
        Assert.assertEquals(actual,expected);
    }

    // Make a bigger test exercising more Stack methods.....DONE!-JC
}
