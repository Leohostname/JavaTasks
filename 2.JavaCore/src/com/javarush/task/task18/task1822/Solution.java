package com.javarush.task.task18.task1822;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Поиск данных внутри файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream fisForFile = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fisForFile, StandardCharsets.UTF_8);

        char[] buffer = new char[fisForFile.available()];

        inputStreamReader.read(buffer);

        String fileContent = "";

        for (char b : buffer) fileContent += b;

        String[] linesInFile = fileContent.split("\n");

        String info = "";

        for (String line : linesInFile)
        {
            String[] buff = line.split(" ");

            if (buff[0].equals(args[0])) info = line;
        }

        System.out.println(info);

        reader.close();
        fisForFile.close();
        inputStreamReader.close();
    }
}
