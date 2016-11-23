package com.goit.gojavaonline.test.module4.task1;

import com.goit.gojavaonline.module4.task1.Rectangle;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RectangleTest {
    @Test
    public void countArea() throws Exception {
        final double sideA = 2;
        final double sideB = 2;
        final double area = sideA * sideB;
        Rectangle rectangle = new Rectangle(sideA, sideB);
        final double result = rectangle.countArea();

        assertEquals(sideA, sideB, 0.01);
        assertTrue("Result is " + result + "not equals" + area, result == area);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test is successfull, congrats");
    }
}