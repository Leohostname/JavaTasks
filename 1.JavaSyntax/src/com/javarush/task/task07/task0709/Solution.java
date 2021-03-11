package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listOfString = new ArrayList<String>();

        int minLength = 0;

        for (int i = 0; i < 5; i++)
        {

            listOfString.add(reader.readLine());

            if (i == 0)
            {
                minLength = listOfString.get(i).length();
            }
            else if (minLength > listOfString.get(i).length())
            {
                minLength = listOfString.get(i).length();
            }

        }

        for (int i = 0; i < listOfString.size(); i++)
        {
            if (listOfString.get(i).length() == minLength)
            {
                System.out.println(listOfString.get(i));
            }
        }



    }

}
