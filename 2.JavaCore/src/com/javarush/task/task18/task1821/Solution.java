package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fisForFile = new FileInputStream(args[0]);

        HashMap<Byte, Integer> hashMap = new HashMap<>();

        byte[] buffer = new byte[fisForFile.available()];
        fisForFile.read(buffer);

        for (byte b : buffer) hashMap.putIfAbsent(b, 0);

        for (Map.Entry<Byte, Integer> entry : hashMap.entrySet())
        {
            for (byte b : buffer) if (b == entry.getKey()) entry.setValue(entry.getValue() + 1);
        }

        Object[] byteArray = hashMap.keySet().toArray();

        Arrays.sort(byteArray);

        for (Object b : byteArray) System.out.println((char)b.hashCode() + " " + hashMap.get(b));

        fisForFile.close();
    }
}
