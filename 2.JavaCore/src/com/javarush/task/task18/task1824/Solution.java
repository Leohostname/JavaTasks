package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.file.FileSystemException;

/* 
Файлы и исключения
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "";
        while (true)
        {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
            {
                fileName = reader.readLine();
                FileInputStream fis = new FileInputStream(fileName);
                fis.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println(fileName);
                break;
            }
        }
    }
}
