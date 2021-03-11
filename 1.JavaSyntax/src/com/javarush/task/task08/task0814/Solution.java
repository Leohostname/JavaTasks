package com.javarush.task.task08.task0814;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution
{
    public static Set<Integer> createSet()
    {
        Set<Integer> set = new HashSet<Integer>();

        set.add(5);
        set.add(11);
        set.add(15);
        set.add(1);
        set.add(7);
        set.add(88);
        set.add(23);
        set.add(3);
        set.add(10);
        set.add(12);
        set.add(0);
        set.add(90);
        set.add(29);
        set.add(37);
        set.add(45);
        set.add(77);
        set.add(48);
        set.add(34);
        set.add(8);
        set.add(9);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set)
    {
        set.removeIf(value -> value > 10);

        return set;
    }

    public static void main(String[] args) throws Exception
    {

    }
}
