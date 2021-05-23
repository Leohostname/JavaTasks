package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution
{
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine()))
        {
            String fileContent = "";
            while (fileReader.ready())
            {
                fileContent += (char) fileReader.read();
            }

            String[] lineArray = fileContent.split("\n");

            for (String line : lineArray)
            {
                System.out.println(new StringBuilder(line).reverse().toString());
            }
        } catch (IOException ignored) {}
    }
}
