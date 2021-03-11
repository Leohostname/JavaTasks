package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution
{

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listSortOne = new ArrayList<Integer>();
        ArrayList<Integer> listSortTwo = new ArrayList<Integer>();
        ArrayList<Integer> listSortThree = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
        {

            listOne.add(Integer.parseInt(reader.readLine()));

            if (listOne.get(i) % 3 == 0)
            {
                listSortOne.add(listOne.get(i));
            }
            if (listOne.get(i) % 2 == 0)
            {
                listSortTwo.add(listOne.get(i));
            }
            if (listOne.get(i) % 3 != 0 && listOne.get(i) % 2 != 0)
            {
                listSortThree.add(listOne.get(i));
            }

        }

        printList(listSortOne);
        printList(listSortTwo);
        printList(listSortThree);

    }

    public static void printList(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
