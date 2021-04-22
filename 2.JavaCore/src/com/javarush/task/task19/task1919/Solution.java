package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];

        FileReader fileReader = new FileReader(fileName);

        String fileContent = "";
        int cnt = fileReader.read();

        while (cnt != -1)
        {
            fileContent += (char)cnt;

            cnt = fileReader.read();
        }

        String[] contentArray = fileContent.split("\n");
        ArrayList<String> users = new ArrayList<>();
        ArrayList<Double> moneyUsers = new ArrayList<>();

        for (String s : contentArray)
        {
            String user = s.split(" ")[0];
            double money = Double.parseDouble(s.split(" ")[1]);

            if (!users.contains(user))
            {
                users.add(user);
                moneyUsers.add(money);
            }
            else
            {
                moneyUsers.set(users.indexOf(user), moneyUsers.get(users.indexOf(user)) + money);
            }
        }

        String[] finalCount = new String[users.size()];

        for (int i = 0; i < finalCount.length; i++)
        {
            finalCount[i] = users.get(i) + " " + moneyUsers.get(i);
        }

        Arrays.sort(finalCount);

        for (String line : finalCount) System.out.println(line);

        fileReader.close();
    }
}
