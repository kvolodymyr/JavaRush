package com.javarush.task.task05.task0515;

/* 
Инициализация объектов
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int weight, int size, int money, char sex) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.money = money;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
