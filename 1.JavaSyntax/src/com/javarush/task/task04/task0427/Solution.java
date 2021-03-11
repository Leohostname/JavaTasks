package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        if(a >= 1 && a <= 999)
        {
            if(a < 10)
            {
                if(a % 2 == 0)
                {
                    System.out.println("четное однозначное число");
                }
                else
                {
                    System.out.println("нечетное однозначное число");
                }
            }
            else
            {
                if(a < 100)
                {
                    if(a % 2 == 0)
                    {
                        System.out.println("четное двузначное число");
                    }
                    else
                    {
                        System.out.println("нечетное двузначное число");
                    }
                }
                else
                {
                    if(a % 2 == 0)
                    {
                        System.out.println("четное трехзначное число");
                    }
                    else
                    {
                        System.out.println("нечетное трехзначное число");
                    }
                }
            }
        }

    }
}
