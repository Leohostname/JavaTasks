package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int plus, sum = 0;
        String text = "";

        while(!text.equals("сумма"))
        {
            text = reader.readLine();
            if(text.equals("сумма"))
            {
                break;
            }
            plus = Integer.parseInt(text);
            sum += plus;
        }

        System.out.println(sum);
    }
}
