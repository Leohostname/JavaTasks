package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[20];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array)
        {
            System.out.println(word);
        }

    }

    public static void sort(String[] array)
    {
        String start = array[0];

        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (isGreaterThan(array[i], array[i + 1]))
                {
                    start = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = start;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
