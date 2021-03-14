package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
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

        while (bufReader.ready())
        {
            char temp = (char) bufReader.read();

            if (temp != '.') bufWriter.write(temp);
            else bufWriter.write('!');
        }

        reader.close();
        bufReader.close();
        bufWriter.close();
    }
}
