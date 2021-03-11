package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Чтение файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath = reader.readLine();

        FileInputStream fis = new FileInputStream(filePath);

        String line = "";

        while (fis.available() > 0)
        {
            line += (char) fis.read();
        }

        List<String> listWithInfo = Arrays.asList(line.split("\n"));

        for (String s : listWithInfo)
        {
            System.out.println(s);
        }

        fis.close();
        reader.close();
    }
}