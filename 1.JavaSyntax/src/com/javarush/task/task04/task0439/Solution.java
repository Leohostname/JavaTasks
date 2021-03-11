package com.javarush.task.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Письмо счастья
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        for(int i = 0; i <= 9; i++)
        {
            System.out.println(name + " любит меня.");
        }
    }
}
