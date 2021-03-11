package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution
{

    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception
    {

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<String>();

        int maxLength = 0;

        for (int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());

            if (i == 0)
            {
                maxLength = strings.get(i).length();
            }
            else if (maxLength < strings.get(i).length())
            {
                maxLength = strings.get(i).length();
            }

        }

        for (int i = 0; i < strings.size(); i++)
        {
            if(strings.get(i).length() == maxLength)
            {
                System.out.println(strings.get(i));
            }
        }

    }

}
