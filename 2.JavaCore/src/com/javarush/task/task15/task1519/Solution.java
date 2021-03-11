package com.javarush.task.task15.task1519;

import sun.misc.FloatingDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        while (!line.equals("exit"))
        {
            line = reader.readLine();

            if (line.contains("."))
            {
                try
                {
                    print(Double.parseDouble(line));
                }
                catch (NumberFormatException e)
                {
                    if (!line.equals("exit"))
                    {
                        print(line);
                    }
                }
            }
            else
            {
                try
                {
                    if (Integer.parseInt(line) > 0 && Integer.parseInt(line) < 128)
                    {
                        print(Short.parseShort(line));
                    }
                    else
                    {
                        print(Integer.parseInt(line));
                    }
                }
                catch (NumberFormatException c)
                {
                    if (!line.equals("exit"))
                    {
                        print(line);
                    }
                }
            }
        }
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }

}
