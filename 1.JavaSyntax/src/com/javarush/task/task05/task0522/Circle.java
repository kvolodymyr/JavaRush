package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x) {
        this(x, x, 1);
    }

    public Circle(double x, double radius) {
        this(x, x, radius);
    }

    public static void main(String[] args) {

    }
}