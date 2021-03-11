package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String url = reader.readLine();

        url = url.substring(url.indexOf("?") + 1);

        String[] arrayOfParam = url.split("&");

        int count = -1;

        for (int i = 0; i < arrayOfParam.length; i++)
        {
            if (arrayOfParam[i].contains("="))
            {
                System.out.print(arrayOfParam[i].substring(0, arrayOfParam[i].indexOf("=")) + " ");
            }
            else
            {
                System.out.print(arrayOfParam[i] + " ");
            }

            if (arrayOfParam[i].contains("obj")) count = i;
        }

        System.out.println();

        if (count != -1)
        {
            try
            {
                if (arrayOfParam[count].substring(arrayOfParam[count].indexOf("=") + 1).contains("."))
                {
                    alert(Double.parseDouble(arrayOfParam[count].substring(arrayOfParam[count].indexOf("=") + 1)));
                }
                else
                {
                    alert(arrayOfParam[count].substring(arrayOfParam[count].indexOf("=") + 1));
                }
            }
            catch (NumberFormatException e)
            {
                alert(arrayOfParam[count].substring(arrayOfParam[count].indexOf("=") + 1));
            }
        }

    }

    public static void alert(double value)
    {
        System.out.println("double: " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String: " + value);
    }
}
