package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream(args[0]);

        int counterForSpace = 0;
        int counterFLC = 0;

        while (fis.available() > 0)
        {
            byte temporary = (byte)fis.read();

            if (temporary == 32) counterForSpace++;

            counterFLC++;
        }

        double relation = counterForSpace / (1.0 * counterFLC) * 100;

        String result = String.format("%.2f", relation);

        System.out.println(result);

        fis.close();
    }
}
