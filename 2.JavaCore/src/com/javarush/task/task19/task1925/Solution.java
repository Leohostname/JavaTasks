package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        try (FileReader fileReader = new FileReader(args[0]);
             FileWriter fileWriter = new FileWriter(args[1]))
        {
            String fileContent = "";
            while (fileReader.ready())
            {
                fileContent += (char) fileReader.read();
            }

            String[] lineArray = fileContent.split("\n");
            ArrayList<String> listForExport = new ArrayList<>();

            for (String line : lineArray)
            {
                String[] contentArray = line.split(" ");
                for (String word : contentArray) if (word.length() > 6) listForExport.add(word + ",");
            }

            String wordForChange = listForExport.get(listForExport.size() - 1).substring(0, listForExport.get(listForExport.size() - 1).length() - 1);
            listForExport.set(listForExport.size() - 1, wordForChange);

            for (String word : listForExport) fileWriter.write(word);

        } catch (Exception ignored) {}
    }
}
