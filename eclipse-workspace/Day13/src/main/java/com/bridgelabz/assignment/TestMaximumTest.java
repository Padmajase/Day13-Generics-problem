package com.bridgelabz.assignment;

import org.junit.*;

public class TestMaximumTest {
    @Test
    public void testMaximum(){
        Integer[] a = {2, 3, 4 };
        int maxNumber = Generic.testMaximum(2,3,5);
        Assert.assertEquals(5, maxNumber);
    }

}
