package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
            b = Integer.parseInt(reader.readLine()),
            c = Integer.parseInt(reader.readLine());

        if(a > b)
        {
            if(a < c)
            {
                System.out.println(a);
            }
            else
            {
                if(b > c)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(c);
                }
            }
        }
        else
        {
            if(b < c)
            {
                System.out.println(b);
            }
            else
            {
                if(a > c)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(c);
                }
            }
        }

    }
}
