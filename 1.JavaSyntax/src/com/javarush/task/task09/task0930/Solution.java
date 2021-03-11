package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String s = "s";

        while (!s.isEmpty())
        {
            s = reader.readLine();
            if (s.isEmpty())
            {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }

    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                numberList.add(Integer.parseInt(array[i]));
            }
            else
            {
                stringList.add(array[i]);
            }
        }

        for (int i = 0; i < numberList.size(); i++)
        {
            for (int j = 0; j < numberList.size() - 1; j++)
            {
                if (numberList.get(j) < numberList.get(j + 1))
                {
                    count = numberList.get(j);
                    numberList.set(j, numberList.get(j + 1));
                    numberList.set(j + 1, count);
                }
            }
        }

        String s = "bla";

        for (int i = 0; i < stringList.size(); i++)
        {
            for (int j = 0; j < stringList.size() - 1; j++)
            {
                if (isGreaterThan(stringList.get(j), stringList.get(j + 1)))
                {
                    s = stringList.get(j);
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, s);
                }
            }
        }
        int numCounter = 0, strCounter = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                array[i] = "" + numberList.get(numCounter);
                numCounter++;
            }
            else
            {
                array[i] = stringList.get(strCounter);
                strCounter++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text)
    {
        if (text.length() == 0)
        {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-')
            {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-')
            {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-')
            {
                return false;
            }
        }

        return true;
    }
}
