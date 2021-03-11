package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        int size = list.size();
        for (int i = 0; i < size; i++)
        {
            list.add((i * 2) + 1, list.get(i * 2));
        }

        return list;

    }

}
