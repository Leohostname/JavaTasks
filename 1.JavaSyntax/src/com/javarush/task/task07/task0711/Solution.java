package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listOfString = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            listOfString.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++)
        {
            String line = listOfString.get(listOfString.size() - 1);
            listOfString.remove(listOfString.size() - 1);
            listOfString.add(0, line);
        }

        for (int i = 0; i < listOfString.size(); i++)
        {
            System.out.println(listOfString.get(i));
        }

    }

}
