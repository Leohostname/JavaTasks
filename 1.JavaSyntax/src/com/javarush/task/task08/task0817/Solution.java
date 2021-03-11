package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution
{
    public static Map<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++)
        {
            map.put("" + i, "" + i);
        }

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map)
    {
        Map<String, String> copy = new HashMap<>(map);
        Map<String, String> secondCopy = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            for (Map.Entry<String, String> copyPair : secondCopy.entrySet())
            {
                if (pair.getValue().equals(copyPair.getValue()))
                {
                    count += 1;
                    if (count == 2)
                    {
                        removeItemFromMapByValue(map, pair.getValue());
                        count = 0;
                    }
                }
            }
            count = 0;
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value)
    {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
            {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
