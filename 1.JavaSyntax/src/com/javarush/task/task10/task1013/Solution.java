package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class Human
    {
       private int age, height, weight;
       private String name, surname, fatherName;

       public Human (String name, String surname, String fatherName, int age, int weight, int height)
       {
           this.name = name;
           this.surname = surname;
           this.fatherName = fatherName;
           this.age = age;
           this.weight = weight;
           this.height = height;
       }

        public Human (String name, String surname, String fatherName, int age, int weight)
        {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
            this.age = age;
            this.weight = weight;
        }

        public Human (String name, String surname, String fatherName, int age)
        {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
            this.age = age;
        }

        public Human (String name, String surname, String fatherName)
        {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
        }

        public Human (String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human (String name)
        {
            this.name = name;
        }

        public Human (String name, String fatherName, int age, int weight, int height)
        {
            this.name = name;
            this.fatherName = fatherName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human (String name, int age, int weight, int height)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human (String name, String surname, int weight, int height)
        {
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
        }

        public Human (int age, int weight, int height)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
