package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());

        String content = "";

        while (fileReader.ready())
        {
            char letter = (char) fileReader.read();
            content += Character.isAlphabetic(letter) ? letter : " ";
        }

        int count = 0;

        String[] array = content.split(" ");

        for (String s : array) count += s.equals("world") ? 1 : 0;

        System.out.println(count);

        reader.close();
        fileReader.close();
    }
}
