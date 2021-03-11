package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution
{

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++)
        {
            if(i == 0 || i % 2 == 0)
            {
                countEven += array[i];
            }
            else
            {
                countOdd += array[i];
            }
        }

        if(countEven > countOdd)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }

}
