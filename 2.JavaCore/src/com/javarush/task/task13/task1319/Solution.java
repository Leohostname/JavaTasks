package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("testFile.txt"));

        String line = "";

        while(!line.equals("exit"))
        {
            line = reader.readLine();
            writer.write(line);
            writer.newLine();
        }

        writer.close();
    }
}
