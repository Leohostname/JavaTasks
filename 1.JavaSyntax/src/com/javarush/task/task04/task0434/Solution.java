package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution
{
    public static void main(String[] args)
    {

        int a = 1, b = 1;

        while(a < 11)
        {
            while(b < 11)
            {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println("");
            b = 1;
            a++;
        }
    }
}
