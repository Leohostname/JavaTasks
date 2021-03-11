package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static String doDate(String date)
    {
        String[] dateArray = date.split("/");

        return "" + dateArray[1] + "/" + dateArray[0] + "/" + Integer.parseInt(dateArray[2]);
    }

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args)
    {

        switch (args[0])
        {
            case "-c":

                if (args[2].equals("м"))
                {
                    allPeople.add(Person.createMale(args[1], new Date(doDate(args[3]))));
                }
                else if (args[2].equals("ж"))
                {
                    allPeople.add(Person.createFemale(args[1], new Date(doDate(args[3]))));
                }
                else
                {
                    System.out.println("Неверно указан формат!");
                }

                System.out.println(allPeople.size() - 1);

                break;

            case "-u":

                if (args[3].equals("м"))
                {
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], new Date(doDate(args[4]))));
                }
                else if (args[3].equals("ж"))
                {
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], new Date(doDate(args[4]))));
                }
                else
                {
                    System.out.println("Неверно указан пол!");
                }

                break;

            case "-d":

                allPeople.set(Integer.parseInt(args[1]), allPeople.get(Integer.parseInt(args[1])).reset());

                break;

            case "-i":

                System.out.println(allPeople.get(Integer.parseInt(args[1])));
        }
    }
}
