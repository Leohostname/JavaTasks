package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution
{

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String count = reader.readLine();
        int number = Integer.parseInt(count);

        for(int i = 0; i < count.length(); i++)
        {
            if(number % 2 == 0)
            {
                even += 1;
            }
            else
            {
                odd += 1;
            }
            number = number / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
