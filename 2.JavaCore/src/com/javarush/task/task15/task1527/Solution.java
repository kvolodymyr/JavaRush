package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    static ArrayList<String> values = new ArrayList<String>();

    public static void main(String[] args) throws Exception

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();

        Pattern qust = Pattern.compile("(\\?|&)\\w*");

        Matcher qustm = qust.matcher(a);

        while(qustm.find())

        {
            System.out.print(qustm.group().replaceAll("(\\?)|(\\&)", "")+ " ");
        }

        System.out.println(" ");

        Pattern object = Pattern.compile("obj=\\w*[.,]*?\\w*(&|\\z)");

        Matcher objectm = object.matcher(a);

        while(objectm.find())

        {

            String r = objectm.group().replaceAll("(\\?)|(\\&)|.*(\\=)", "");

            if(isNumeric(r)==true)
            { double p = Double.parseDouble(r);
                alert(p);
            }
            else alert(r);
        }

    }
    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
