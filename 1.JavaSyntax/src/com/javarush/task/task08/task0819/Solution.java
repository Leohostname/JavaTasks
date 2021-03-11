package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> setCat = new HashSet<Cat>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        setCat.add(cat1);
        setCat.add(cat2);
        setCat.add(cat3);

        return setCat;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat i : cats)
        {
            System.out.println(i);
        }
    }

    public static class Cat
    {
        public Cat()
        {

        }
    }
}
