package com.goit.gojavaonline.test.module4.task2;

import com.goit.gojavaonline.module4.task2.TemperatureUtils;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperatureUtilsTest {
    @Test(timeout = 1000)
    public void convertFToC() throws Exception {
        double degreeF = 0;
        double resultC = (degreeF - 32) * 5 / 9;
        double result = TemperatureUtils.convertToC(degreeF);
        assertEquals(resultC, result, 0.01);
    }

    @Test(timeout = 1000)
    public void convertToF() throws Exception {
        double degreeC = 0;
        double resultF = ((degreeC * 5 / 9) + 32);
        double result = TemperatureUtils.convertToF(degreeC);
        assertEquals(resultF, result, 0.01);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Tests are successfull, congrats");
    }

}