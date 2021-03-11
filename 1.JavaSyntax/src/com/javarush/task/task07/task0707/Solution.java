package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution
{

    public static void main(String[] args)
    {

        ArrayList<String> listOfString = new ArrayList<String>();

        for(int i = 0; i < 5; i++)
        {
            listOfString.add("asdas");
        }

        System.out.println(listOfString.size());

        for(int i = 0; i < listOfString.size(); i++)
        {
            System.out.println(listOfString.get(i));
        }

    }

}
