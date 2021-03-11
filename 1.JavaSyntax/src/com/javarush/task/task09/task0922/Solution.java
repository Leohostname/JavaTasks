package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        String datin = reader.readLine();

        Date date = format.parse(datin);

        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(format1.format(date).toUpperCase());
    }
}
