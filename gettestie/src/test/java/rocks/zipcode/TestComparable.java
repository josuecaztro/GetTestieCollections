package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestComparable {

    @Test
    public void testComparable1(){
        Person person = new Person("Joshua",1999);
        Person person1 = new Person("Brian", 2002);
        Person person2 = new Person("Daniel", 1980);
    //WE COMPARE BY PERSON BIRTH YEAR
        int actual = person2.compareTo(person1);
        int expected = -1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testComparable2(){
        Address address = new Address("Main","Pottstown","19405");
        Address address2 = new Address("Clover","Wilmington","15475");
        //WE COMPARE BY ADDRESS TOWN
        int actual = address.compareTo(address2);
        boolean actualActual = actual < 0;
        Assert.assertTrue(actualActual);
    }

}
