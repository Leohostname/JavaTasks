package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] array = new String[string.split(" ").length];
        array = string.split(" ");

        List<String> list = new ArrayList<String>(Arrays.asList(array));

        list.removeIf(element -> element.equals(""));

        for (int i = 0; i < list.size(); i++)
        {
            String temporary = list.get(i).substring(0, 1).toUpperCase() + list.get(i).substring(1);
            list.set(i, temporary);
        }

        for (String elem : list)
        {
            System.out.print(elem + " ");
        }

    }
}
