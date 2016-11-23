package com.goit.gojavaonline.test.module4.task1;

import com.goit.gojavaonline.module4.task1.Circle;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedCircleTest {
    private double radius;
    private double expected;


    public ParametrizedCircleTest(double radius, double expected) {
        this.radius = radius;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 3.14},
                {2, 3.14 * 2 * 2}
        });
    }

    @Test
    public void testCountArea() {
        Circle circle = new Circle(radius);
        double result = circle.countArea();
        Assert.assertEquals(result, expected, 0.01);
    }
}
