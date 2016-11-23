package com.goit.gojavaonline.test.module4.task1;

import com.goit.gojavaonline.module4.task1.Circle;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CircleTest {

    @Test
    public void countArea() throws Exception {
        final double radius = 1;
        final double area = Math.PI * Math.pow(radius, 2);
        Circle circle = new Circle(radius);
        final double result = circle.countArea();

        assertEquals(area, result, 0.01);
        assertTrue("Result is " + result + "not equals" + area, result == area);
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test is successfull, congrats");
    }

}