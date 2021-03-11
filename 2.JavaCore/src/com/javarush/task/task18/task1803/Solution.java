package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Самые частые байты
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream readFile = new FileInputStream(reader.readLine());

        int[] arrayOfBytes = new int[256];

        while (readFile.available() > 0)
        {
            arrayOfBytes[readFile.read()] += 1;
        }


        int max = arrayOfBytes[0];
        int index = 0;

        for (int i = 1; i < arrayOfBytes.length; i++)
        {
            if (arrayOfBytes[i] > max)
            {
                max = arrayOfBytes[i];
                index = i;
            }

        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = index; i < arrayOfBytes.length; i++)
        {
            if (arrayOfBytes[i] == max) arrayList.add(i);
        }

        for (int inx : arrayList)
        {
            System.out.print((inx) + " ");
        }

        reader.close();
        readFile.close();

    }
}
