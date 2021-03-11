package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> listOfString = new ArrayList<String>();
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < 10; i++)
        {
            listOfString.add(reader.readLine());
        }

        String maxLine = listOfString.get(maxIndex), minLine = listOfString.get(minIndex);

        for (int i = 0; i < listOfString.size(); i++)
        {

            if(listOfString.get(i).length() < listOfString.get(minIndex).length())
            {
                minIndex = i;
                minLine = listOfString.get(i);
            }

            if(listOfString.get(i).length() > listOfString.get(maxIndex).length())
            {
                maxIndex = i;
                maxLine = listOfString.get(i);
            }

        }

        if(maxIndex < minIndex)
        {
            System.out.println(maxLine);
        }
        else
        {
            System.out.println(minLine);
        }


    }

}
