 package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution
{
    public static Map<String, Integer> createMap()
    {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 10; i++)
        {
            map.put("" + i, i * 100);
        }

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map)
    {
        map.entrySet().removeIf(value -> value.getValue() < 500);
    }

    public static void main(String[] args)
    {

    }
}