package com.goit.gojavaonline.module4.task1;


import java.util.Scanner;

public class Rectangle {
    public  static void main (String[] args){
        int sideA;
        int sideB;

        System.out.println("Введите значение стороны прямоугольника A: ");
        sideA = new Scanner(System.in).nextInt();
        System.out.println("Введите значение стороны прямоугольника B: ");
        sideB = new Scanner(System.in).nextInt();

        System.out.println("Площадь прямоугольника равна: " + (sideA*sideB));

    }
}
