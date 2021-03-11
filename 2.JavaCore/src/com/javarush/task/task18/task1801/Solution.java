package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream readFile = new FileInputStream(reader.readLine());

        int max = 0;

        while (readFile.available() > 0)
        {
            int change = readFile.read();

            if (change > max) max = change;
        }

        System.out.println(max);

        reader.close();
        readFile.close();
    }
}
