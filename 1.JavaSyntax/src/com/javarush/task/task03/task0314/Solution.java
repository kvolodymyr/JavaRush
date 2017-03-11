package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 1 /* 0 */; i <= 10; i++)
        {
            for(int j = 1 /* 0 */; j <= 10; j++)
            {
//                if(i == 0 || j == 0)
//                {
//                    System.out.print(i == 0 && j == 0 ? "    " : String.format("% 4d", j == 0 ? i : j));
//                    continue;
//                }
//                System.out.print(String.format("% 4d", i * j));
                System.out.print(String.format("% d", i * j));
            }
            System.out.println();
        }

    }
}
