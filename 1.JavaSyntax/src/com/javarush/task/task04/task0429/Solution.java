package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
            b = Integer.parseInt(reader.readLine()),
            c = Integer.parseInt(reader.readLine());

        int countOfPlus = 0, countOfMinus = 0;

        if(a > 0)
        {
            countOfPlus++;
        }
        else
        {
            if(a < 0) countOfMinus++;
        }

        if(b > 0)
        {
            countOfPlus++;
        }
        else
        {
            if(b < 0) countOfMinus++;
        }

        if(c > 0)
        {
            countOfPlus++;
        }
        else
        {
            if(c < 0) countOfMinus++;
        }

        System.out.println("количество отрицательных чисел: " + countOfMinus);
        System.out.println("количество положительных чисел: " + countOfPlus);
    }
}
