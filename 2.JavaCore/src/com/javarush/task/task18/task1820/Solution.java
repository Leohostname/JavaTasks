package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fisForFile = new FileInputStream(reader.readLine());
        FileOutputStream fosForFile = new FileOutputStream(reader.readLine(), true);

        String fileContent = "";

        while(fisForFile.available() > 0)
        {
            fileContent += (char)fisForFile.read();
        }

        String[] array = fileContent.trim().split(" ");
        double[] arrayForDouble = new double[array.length];

        for (int i = 0; i < array.length; i++) arrayForDouble[i] = Double.parseDouble(array[i]);

        long[] arrayForRounded = new long[arrayForDouble.length];

        for (int i = 0; i < arrayForRounded.length; i++) arrayForRounded[i] = Math.round(arrayForDouble[i]);

        String outputContent = "";

        for (long l : arrayForRounded) outputContent += l + " ";

        fosForFile.write(outputContent.getBytes());

        reader.close();
        fisForFile.close();
        fosForFile.close();
    }
}
