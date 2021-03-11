package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Минимальный байт
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
            arrayList.add(filePath.read());
        }

        arrayList.sort(Comparator.naturalOrder());

        System.out.println(arrayList.get(0));

        reader.close();
        filePath.close();
    }
}
