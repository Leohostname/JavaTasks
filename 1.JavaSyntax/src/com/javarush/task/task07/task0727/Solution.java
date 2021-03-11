package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true)
        {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() % 2 == 0)
            {
                String line = strings.get(i) + " " + strings.get(i);
                resultStrings.add(line);
            }
            else
            {
                String line = strings.get(i) + " " + strings.get(i) + " " + strings.get(i);
                resultStrings.add(line);
            }
        }

        for (int i = 0; i < resultStrings.size(); i++)
        {
            System.out.println(resultStrings.get(i));
        }
    }
}
