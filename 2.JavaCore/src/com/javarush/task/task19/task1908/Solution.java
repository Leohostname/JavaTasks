package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();
        String secondFile = reader.readLine();

        BufferedReader bufReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(secondFile));

        String content = "";

        while (bufReader.ready())
        {
            int temp = bufReader.read();

            if (Character.isLetterOrDigit(temp) || temp == 32)
            {
                content += (char) temp;
            }
        }

        System.out.println(content);

        String[] arr = content.split(" ");

        ArrayList<Integer> arrList = new ArrayList<>();

        for (String s : arr)
        {
            try
            {
                arrList.add(Integer.parseInt(s));
            }
            catch (Exception e){}
        }

        String exitContent = "";

        for (int number : arrList) exitContent += number + " ";

        bufWriter.write(exitContent.trim().toCharArray());

        reader.close();
        bufReader.close();
        bufWriter.close();
    }
}
