package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        int amount = Integer.parseInt(reader.readLine());

        int a = 0;

        while(a < amount)
        {
            System.out.println(line);
            a++;
        }

    }
}
