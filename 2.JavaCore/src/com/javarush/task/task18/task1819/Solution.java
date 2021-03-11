package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFileName = reader.readLine();

        FileInputStream fisForFirstFile = new FileInputStream(firstFileName);
        FileOutputStream fosForFirstFile = new FileOutputStream(firstFileName);

        FileInputStream fisForSecondFile = new FileInputStream(reader.readLine());

        byte[] buffer1 = new byte[fisForFirstFile.available()];
        fisForFirstFile.read(buffer1);
        byte[] buffer2 = new byte[fisForSecondFile.available()];
        fisForSecondFile.read(buffer2);

        byte[] buffer = new byte[buffer1.length + buffer2.length];

        for (int i = 0; i < buffer2.length; i++) buffer[i] = buffer2[i];
        for (int i = 0; i < buffer1.length; i++) buffer[i + buffer2.length] = buffer1[i];

        fosForFirstFile.write(buffer);

        reader.close();
        fosForFirstFile.close();
        fisForFirstFile.close();
        fisForSecondFile.close();
    }
}
