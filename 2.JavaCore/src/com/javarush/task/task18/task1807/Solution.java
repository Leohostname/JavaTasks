package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream filePath = new FileInputStream(reader.readLine());

        int countOfComma = 0;

        while (filePath.available() > 0)
        {
            if (filePath.read() == 44) countOfComma++;
        }

        System.out.println(countOfComma);

        reader.close();
        filePath.close();
    }
}
