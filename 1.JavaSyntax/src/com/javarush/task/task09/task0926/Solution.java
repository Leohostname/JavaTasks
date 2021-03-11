package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution
{

    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arrayList = new ArrayList<>();

        arrayList.add(new int[]{1, 2, 3, 4, 5});
        arrayList.add(new int[]{1, 2});
        arrayList.add(new int[]{1, 2, 3, 4});
        arrayList.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        arrayList.add(new int[]{});

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            for (int x : array)
            {
                System.out.println(x);
            }
        }
    }

}
