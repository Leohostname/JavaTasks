package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из котов
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[]
                        {"васька",
                        "мурка",
                        "дымка",
                        "рыжик",
                        "серый",
                        "снежок",
                        "босс",
                        "борис",
                        "визя",
                        "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats)
    {
        /*Cat cat1 = new Cat("1");
        Cat cat2 = new Cat("2");
        Cat cat3 = new Cat("3");
        Cat cat4 = new Cat("4");
        Cat cat5 = new Cat("5");
        Cat cat6 = new Cat("6");
        Cat cat7 = new Cat("7");
        Cat cat8 = new Cat("8");
        Cat cat9 = new Cat("9");
        Cat cat10 = new Cat("10");*/

        /*map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat10.name, cat10);*/


        Map<String, Cat> map = new HashMap<String, Cat>();

        for (String catName : cats)
        {
            map.put(catName, new Cat(catName));
        }

        return map;

    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }

}
