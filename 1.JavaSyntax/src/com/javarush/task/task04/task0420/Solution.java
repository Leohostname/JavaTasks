package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()),
                b = Integer.parseInt(reader.readLine()),
                c = Integer.parseInt(reader.readLine());

        if (a > b)
        {
           if(a > c)
           {
               if(b > c)
               {
                   System.out.println(a + " " + b + " " + c);
               }
               else
               {
                   System.out.println(a + " " + c + " " + b);
               }
           }
           else
           {
               System.out.println(c + " " + a + " " + b);
           }
        }
        else
        {
            if(b > c)
            {
                if(a > c)
                {
                    System.out.println(b + " " + a + " " + c);
                }
                else
                {
                    System.out.println(b + " " + c + " " + a);
                }
            }
            else
            {
                System.out.println(c + " " + b + " " + a);
            }
        }

    }
}
