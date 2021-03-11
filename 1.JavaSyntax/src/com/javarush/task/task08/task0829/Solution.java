package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>();

        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty())
            {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        // Read the house number
        String cityName = reader.readLine();

        if (map.containsKey(cityName))
        {
            String familyName = map.get(cityName) ;
            System.out.println(familyName);
        }

    }

}
