package com.goit.gojavaonline.module4.task1.triangle;


public class TriangleMeasurer {
    public void triangleSurfaceMeasure(double Ab, double Ac, double Bc){

            double perimeter = (Ab +Ac + Bc)/2;
            double square = Math.sqrt(perimeter*(perimeter-Ab)*(perimeter -Ac)*(perimeter -Bc));


    }

}
