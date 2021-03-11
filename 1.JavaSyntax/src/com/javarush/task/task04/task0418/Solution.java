package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine());

        if(a < b)
        {
            System.out.println(a);
        }
        else
        {
            if(a > b)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(a);
            }
        }

    }
}