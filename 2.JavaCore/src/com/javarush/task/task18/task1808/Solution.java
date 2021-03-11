package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream mainFile = new FileInputStream(reader.readLine());
        FileOutputStream firstFile = new FileOutputStream(reader.readLine());
        FileOutputStream secondFile = new FileOutputStream(reader.readLine());

        int firstHalf = mainFile.available() % 2 == 0 ? mainFile.available() / 2 : (mainFile.available() / 2) + 1;

        for (int i = 0; i < firstHalf; i++)
        {
            firstFile.write(mainFile.read());
        }

        while (mainFile.available() > 0)
        {
            secondFile.write(mainFile.read());
        }

        reader.close();
        mainFile.close();
        firstFile.close();
        secondFile.close();
    }
}
