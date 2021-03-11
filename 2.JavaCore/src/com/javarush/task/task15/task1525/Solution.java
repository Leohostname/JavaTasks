package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution
{
    public static List<String> lines = new ArrayList<String>();

    static
    {
        try
        {
            FileReader reader = new FileReader(Statics.FILE_NAME);

            int c;
            String element = "";

            while ((c = reader.read()) != -1)
            {
                element += (char)c;
            }

            lines.addAll(Arrays.asList(element.split("\n")));

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        System.out.println(lines);
    }
}
