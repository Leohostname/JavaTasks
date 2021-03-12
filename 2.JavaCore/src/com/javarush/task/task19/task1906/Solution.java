package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();

        FileInputStream fisForFirstFile = new FileInputStream(firstFile);
        FileReader fileReader = new FileReader(firstFile);
        FileWriter fileWriter = new FileWriter(reader.readLine());

        char[] content = new char[fisForFirstFile.available()];
        fileReader.read(content);

        for (int i = 1; i < content.length; i += 2)
        {
            fileWriter.write(content[i]);
        }

        reader.close();
        fisForFirstFile.close();
        fileReader.close();
        fileWriter.close();
    }
}
