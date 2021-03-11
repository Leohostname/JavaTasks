package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();


        while (true)
        {
            String line = reader.readLine();
            if(line.equals(""))
            {
                break;
            }

            int number = Integer.parseInt(line);
            line = reader.readLine();

            map.put(line, number);
        }

        for (Map.Entry pair : map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
