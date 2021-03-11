package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream reader = new FileInputStream(args[0]);

        //counter for english characters
        int counterFEC = 0;

        while (reader.available() > 0)
        {
            byte temporary = (byte) reader.read();

            if (temporary >= 97 && temporary <= 122 || temporary >= 65 && temporary <= 90) counterFEC++;
        }

        System.out.println(counterFEC);
        reader.close();
    }
}
