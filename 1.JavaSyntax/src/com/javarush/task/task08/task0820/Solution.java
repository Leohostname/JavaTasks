package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++)
        {
            Cat cat = new Cat();
            result.add(cat);
        }

        return result;
    }

    public static Set<Dog> createDogs()
    {
        Set<Dog> result = new HashSet<Dog>();

        for (int i = 0; i < 3; i++)
        {
            Dog dog = new Dog();
            result.add(dog);
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> setObject = new HashSet<Object>();

        setObject.addAll(cats);
        setObject.addAll(dogs);

        return setObject;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Set<Object> copyPets = new HashSet<Object>(pets);

        for (Object copy : copyPets)
        {
            for (Cat cat : cats)
            {
                if (copy.equals(cat))
                {
                    pets.remove(copy);
                }
            }
        }
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object object : pets)
        {
            System.out.println(object);
        }
    }

    public static class Dog
    {

    }

    public static class Cat
    {

    }

}
