package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
                b = Integer.parseInt(reader.readLine()),
                c = Integer.parseInt(reader.readLine()),
                d = Integer.parseInt(reader.readLine());

        if (a > b)
        {
            if(a > c)
            {
                if(a > d)
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println(d);
                }
            }
            else
            {
                if(c > d)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(d);
                }
            }
        }
        else
        {
            if(b > c)
            {
                if(b > d)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(d);
                }
            }
            else
            {
                if(c > d)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(d);
                }
            }
        }


    }
}
