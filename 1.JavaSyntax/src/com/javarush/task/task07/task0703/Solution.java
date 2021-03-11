package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution
{

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayOfString = new String[10];
        int[] arrayOfInteger = new int[10];

        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = reader.readLine();
        }

        for (int i = 0; i < arrayOfInteger.length; i++)
        {
            arrayOfInteger[i] = arrayOfString[i].length();
        }

        for (int i = 0; i < arrayOfInteger.length; i++)
        {
            System.out.println(arrayOfInteger[i]);;
        }

    }

}
