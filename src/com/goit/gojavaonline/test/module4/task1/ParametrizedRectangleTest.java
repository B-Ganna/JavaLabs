package com.goit.gojavaonline.test.module4.task1;

import com.goit.gojavaonline.module4.task1.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedRectangleTest {
    private double sideA;
    private double sideB;
    private double area;

    public ParametrizedRectangleTest(double sideA, double sideB, double area) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = area;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][]{
                {2, 3, 6},
                {4, 5, 20},
                {12, 12, 144}
        });
    }

    @Test
    public void testCountArea() throws Exception {
        Rectangle rectangle = new Rectangle(sideA, sideB);
        double result = rectangle.countArea();
        Assert.assertEquals(result, area, 0.01);
    }

}