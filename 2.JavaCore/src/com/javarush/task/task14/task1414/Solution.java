package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

/* 
MovieFactory
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        Movie movie = null;

        do
        {
            line = reader.readLine();

            movie = MovieFactory.getMovie(line);

            if (!line.equals("thriller") && !line.equals("cartoon") && !line.equals("soapOpera")) break;

            System.out.println(movie.getClass().getSimpleName());

        }
        while (line.equals("thriller") || line.equals("cartoon") || line.equals("soapOpera"));


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key))
            {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key))
            {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie
    {

    }

    static class SoapOpera extends Movie
    {

    }

    public static class Cartoon extends Movie
    {

    }

    public static class Thriller extends Movie
    {

    }
}
