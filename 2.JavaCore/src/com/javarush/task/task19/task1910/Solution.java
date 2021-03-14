package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstPath = reader.readLine();
        String secondPath = reader.readLine();

        BufferedReader bufReader = new BufferedReader(new FileReader(firstPath));
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(secondPath));

        while (bufReader.ready())
        {
            int temp = bufReader.read();

            if (Character.isAlphabetic(temp) || temp == 32)
            {
                bufWriter.write(temp);
            }
        }

        reader.close();
        bufReader.close();
        bufWriter.close();
    }
}
