package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0, number = 0;

        while(number != -1)
        {
            number = Integer.parseInt(reader.readLine());
            count += number;
        }

        System.out.println(count);
    }
}
