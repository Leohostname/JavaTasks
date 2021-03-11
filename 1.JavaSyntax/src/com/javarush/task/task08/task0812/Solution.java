package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<Integer>();

        int maxQueue = 1, secondQueue = 0;

        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int comparisonValue = list.get(0);

        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) == comparisonValue)
            {
                if (secondQueue != 0)
                {
                    if (maxQueue <= secondQueue)
                    {
                        maxQueue = secondQueue + 1;
                        secondQueue = 0;
                    }
                    else
                    {
                        secondQueue += 1;
                    }
                }
                else
                {
                    maxQueue += 1;
                }
            }
            else
            {
                comparisonValue = list.get(i);
                secondQueue = 1;
            }
        }

        System.out.println(maxQueue);

    }
}