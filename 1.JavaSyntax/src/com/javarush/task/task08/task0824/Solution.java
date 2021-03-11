package com.javarush.task.task08.task0824;

import javax.swing.text.html.parser.TagElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Human leo = new Human("Leo", true, 18);
        Human sonya = new Human("Sonya", false, 16);
        Human nastya = new Human("Nastya", false, 11);

        ArrayList<Human> listChildren = new ArrayList<>();
        listChildren.add(leo);
        listChildren.add(sonya);
        listChildren.add(nastya);

        Human timur = new Human("Timur", true, 47, listChildren);
        Human sveta = new Human("Sveta", false, 52, listChildren);

        ArrayList<Human> listParent1 = new ArrayList<>();
        listParent1.add(timur);

        ArrayList<Human> listParent2 = new ArrayList<>();
        listParent2.add(sveta);

        Human gf1 = new Human("Grisha", true, 68, listParent1);
        Human gm1 = new Human("Sveta", false, 65, listParent1);
        Human gf2 = new Human("Leonid", true, 78, listParent2);
        Human gm2 = new Human("Raya", false, 73, listParent2);

        System.out.println(gf1);
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);
        System.out.println(timur);
        System.out.println(sveta);
        System.out.println(leo);
        System.out.println(sonya);
        System.out.println(nastya);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
    }
}
