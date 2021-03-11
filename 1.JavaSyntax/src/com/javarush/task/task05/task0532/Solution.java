package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0, number;

        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                if(i == 0)
                {
                    number = Integer.parseInt(reader.readLine());
                    maximum = number;
                }
                else
                {
                    number = Integer.parseInt(reader.readLine());
                    if (number > maximum)
                    {
                        maximum = number;
                    }
                }
            }
            System.out.println(maximum);
        }





    }
}
