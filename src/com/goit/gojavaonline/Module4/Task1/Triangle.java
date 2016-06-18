package com.goit.gojavaonline.module4.task1;


import java.util.Scanner;

public class Triangle {
    public static void main (String[] args){
        int sideA;
        int sideB;

        System.out.println("Введите значение стороны треугольника A: ");
        sideA = new Scanner(System.in).nextInt();
        System.out.println("Введите значение стороны треугольника B: ");
        sideB = new Scanner(System.in).nextInt();

        System.out.println("Площадь треугольника равна: " + ((sideA*sideB)/2));

    }

}
