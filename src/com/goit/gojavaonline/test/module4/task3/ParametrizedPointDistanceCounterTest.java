package com.goit.gojavaonline.test.module4.task3;

import com.goit.gojavaonline.module4.task3.Point;
import com.goit.gojavaonline.module4.task3.PointDistanceCounter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedPointDistanceCounterTest {
    private Point one;
    private Point two;
    private double distance;

    public ParametrizedPointDistanceCounterTest(Point one, Point two, double distance) {
        this.one = one;
        this.two = two;
        this.distance = distance;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][]{
                {new Point(0, 0), new Point(4, 6), 7.211102550927978},
                {new Point(2, 9), new Point(-2, 0), 9.848857801796104},
                {new Point(1, 5), new Point(-3, -7), 12.649110640673518}
        });
    }


    @Test(timeout = 1000)
    public void testCountDistance() throws Exception {
        PointDistanceCounter pointDistanceCounter = new PointDistanceCounter();
        double result = pointDistanceCounter.countDistance(one, two);
        Assert.assertEquals(distance, result, 0.01);


    }

}