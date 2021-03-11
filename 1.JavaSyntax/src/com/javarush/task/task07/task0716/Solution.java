package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");

        strings = fix(strings);

        for (String string : strings)
        {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings)
    {
        ArrayList<String> copy = new ArrayList<>(strings);

        for (String str : strings)
        {
            if (str.contains("р") && str.contains("л"))
            {
                continue;
            }
            else if (str.contains("р"))
            {
                copy.remove(copy.indexOf(str));
            }
            else if (str.contains("л"))
            {
                copy.add(copy.indexOf(str), str);
            }
        }

        return copy;
    }
}