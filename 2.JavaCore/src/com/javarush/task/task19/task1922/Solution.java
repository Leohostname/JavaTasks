package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution
{
    public static List<String> words = new ArrayList<String>();

    static
    {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);

        String content = "";
        while (fileReader.ready())
        {
            content += (char)fileReader.read();
        }
        fileReader.close();

        String[] contentArray = content.split("\n");


        for (int i = 0; i < contentArray.length; i++)
        {
            String[] lineContent = contentArray[i].split(" ");
            int counter = 0;

            for (int j = 0; j < lineContent.length; j++)
            {
                for (String word : words) if (word.equals(lineContent[j])) counter++;
            }

            if (counter == 2) System.out.println(contentArray[i]);
        }


    }
}
