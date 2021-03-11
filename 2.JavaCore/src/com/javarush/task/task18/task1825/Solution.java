package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        String fileName = line.substring(0, line.indexOf(".part")) + ".txt";
        FileOutputStream fos = new FileOutputStream(fileName, true);

        while (!line.equals("end"))
        {
            FileInputStream fisForFile = new FileInputStream(line);

            byte[] chars = new byte[fisForFile.available()];
            fisForFile.read(chars);

            fos.write(chars);

            line = reader.readLine();
            fisForFile.close();
        }


        reader.close();
        fos.close();
    }
}
