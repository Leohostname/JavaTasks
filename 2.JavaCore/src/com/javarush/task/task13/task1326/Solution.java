package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);

        String s = "";

        while (fis.available() > 0)
        {
            s += (char) fis.read();
        }

        List<String> listOfStr = new ArrayList<>();
        listOfStr = Arrays.asList(s.split("\n"));

        List<Integer> lOI = new ArrayList<>();

        for (String str : listOfStr)
        {
            lOI.add(Integer.parseInt(str));
        }

        Collections.sort(lOI);

        lOI.removeIf(element -> element % 2 != 0);

        for (int i : lOI)
        {
            System.out.println(i);
        }

        fis.close();

    }
}
