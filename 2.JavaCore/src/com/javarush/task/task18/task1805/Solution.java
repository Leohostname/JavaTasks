package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream filePath = new FileInputStream(reader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (filePath.available() > 0)
        {
            int temporary = filePath.read();
            if (!arrayList.contains(temporary)) arrayList.add(temporary);
        }

        arrayList.sort(Comparator.naturalOrder());

        for (int i : arrayList) System.out.print(i + " ");

        reader.close();
        filePath.close();
    }
}
