package com.goit.gojavaonline.test.module4.task1;

import com.goit.gojavaonline.module4.task1.Point;
import com.goit.gojavaonline.module4.task1.Triangle;
import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {

    @Test
    public void TestCountArea() throws Exception {
        final Point a = new Point(0, 0);
        final Point b = new Point(0, 2);
        final Point c = new Point(3, 0);
        final double sideAB = a.countDistanceTo(b);
        final double sideBC = b.countDistanceTo(c);
        final double sideAC = a.countDistanceTo(c);

        final double halfPerimeter = (sideAB + sideBC + sideAC) / 2;
        Triangle triangle = new Triangle(a, b, c);
        final double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter - sideBC) * (halfPerimeter - sideAC));
        final double result = triangle.countArea();
        Assert.assertEquals(area, result, 0.01);
    }

}