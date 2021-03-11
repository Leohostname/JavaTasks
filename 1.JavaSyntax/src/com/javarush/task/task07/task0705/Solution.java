package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution
{

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
        }

        for (int i = 10, j = 0; i < array.length; i++, j++)
        {
            array2[j] = array[i];
        }

        for (int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);
        }

    }

}
