package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayLists = new ArrayList[2];

        ArrayList<String> listOne = new ArrayList<String>();
        listOne.add("shit1");

        ArrayList<String> listTwo = new ArrayList<String>();
        listTwo.add("shit2");

        arrayLists[0] = listOne;
        arrayLists[1] = listTwo;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String string : list)
            {
                System.out.println(string);
            }
        }
    }

}