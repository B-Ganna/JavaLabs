package com.goit.gojavaonline.Module4.Task2;


import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args){
        double a;
        double e;
        int b = 32;
        double c;
        double f;

        System.out.println("Введите градусы по Цельсию: ");
        a = new Scanner(System.in).nextDouble();
        f = (a*9/5)+b;
        System.out.println("Температура в градусах по Фаренгейту: " +f);

        System.out.println("Введите градусы по Фаренгейту: ");
        e = new Scanner(System.in).nextDouble();
        c = (e-b)*5/9;
        System.out.println("Температура в градусах по Цельсию: " +c);
    }
}
