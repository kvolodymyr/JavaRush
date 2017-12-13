package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] keys = new String[] { "cartoon", "thriller", "soapOpera" };
        String key;
        do {
            key = reader.readLine();
            key = Arrays.asList(keys).contains(key) ? key : null;
            /*
            8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
            8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
            8.2 вывести на экран movie.getClass().getSimpleName()
            */
            Movie movie = MovieFactory.getMovie(key);
            if(movie != null) {
                System.out.println(movie.getClass().getSimpleName());
            }
        } while(key != null);
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
