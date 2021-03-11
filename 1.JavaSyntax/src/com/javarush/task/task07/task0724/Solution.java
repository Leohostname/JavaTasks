package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution
{

    public static void main(String[] args)
    {

        Human gf1 = new Human("Гриша", true, 78);
        Human gf2 = new Human("Леонид", true, 69);
        Human gm1 = new Human("Света", false, 75);
        Human gm2 = new Human("Рая", false, 66);
        Human father = new Human("Тимур", true, 47, gf1, gm1);
        Human mother = new Human("Света", false, 51, gf2, gm2);
        Human kid1 = new Human("Лев", true, 18, father, mother);
        Human kid2 = new Human("Соня", false, 16, father, mother);
        Human kid3 = new Human("Маша", false, 10, father, mother);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;

        }
    }
}


