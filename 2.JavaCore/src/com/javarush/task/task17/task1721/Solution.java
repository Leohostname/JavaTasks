package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstPath = reader.readLine();
        String secondPath = reader.readLine();

        FileReader fileReader = new FileReader(firstPath);

        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNext())
        {
            allLines.add(scanner.nextLine());
        }

        fileReader = new FileReader(secondPath);
        scanner = new Scanner(fileReader);

        while (scanner.hasNext())
        {
            forRemoveLines.add(scanner.nextLine());
        }

        Solution solution = new Solution();

        solution.joinData();

        reader.close();
        scanner.close();
    }

    public void joinData() throws CorruptedDataException
    {
        if (allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
