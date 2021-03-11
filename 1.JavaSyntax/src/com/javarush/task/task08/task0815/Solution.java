package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name)
    {
        int count = 0;
        String compareName = "";
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            compareName = pair.getValue();
            if (name.equals(compareName))
            {
                count += 1;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName)
    {
        int count = 0;
        String compareName = "";
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            compareName = pair.getKey();
            if (lastName.equals(compareName))
            {
                count += 1;
            }
        }

        return count;

    }

    public static void main(String[] args)
    {

    }
}
