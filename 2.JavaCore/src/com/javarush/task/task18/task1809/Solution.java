package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream firstFile = new FileInputStream(reader.readLine());
        FileOutputStream secondFile = new FileOutputStream(reader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (firstFile.available() > 0)
        {
            arrayList.add(firstFile.read());
        }

        Collections.reverse(arrayList);

        for (int i : arrayList) secondFile.write(i);

        reader.close();
        firstFile.close();
        secondFile.close();
    }
}
