package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int[] list = getInts();

        for (int i = 0; i < 20; i++)
        {
            if (i == 0)
            {
                maximum = list[i];
                minimum = list[i];
            }
            else
            {
                if (maximum < list[i])
                {
                    maximum = list[i];
                }
                if (minimum > list[i])
                {
                    minimum = list[i];
                }
            }
        }

        System.out.print(maximum + " " + minimum);

    }

    public static int[] getInts() throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;
    }


}
