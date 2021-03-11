package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution
{

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length; i++)
            {
                if(i != array.length - 1)
                {
                    if(array[i] > array[i + 1])
                    {
                        int number = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = number;
                    }
                }
            }
        }


        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }

}
