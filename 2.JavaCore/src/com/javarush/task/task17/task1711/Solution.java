package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution
{
    public static volatile List<Person> allPeople = new ArrayList<Person>();
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
                synchronized (allPeople)
                {
                    for (int i = 1; i <= (args.length - 1) / 3; i++)
                    {
                        if (args[i*3 - 1].equals("м"))
                        {
                            allPeople.add(Person.createMale(args[3*i - 2], new Date(doDate(args[3*i]))));
                        }
                        else if (args[i*3 - 1].equals("ж"))
                        {
                            allPeople.add(Person.createFemale(args[3*i - 2], new Date(doDate(args[3*i]))));
                        }
                        else
                        {
                            System.out.println("Неверно указан формат!");
                        }

                        System.out.println(allPeople.size() - 1);
                    }
                }

                break;

            case "-u":

                synchronized (allPeople)
                {
                    for (int i = 1; i <= (args.length - 1) / 4; i++)
                    {
                        if (args[4*i - 1].equals("м"))
                        {
                            allPeople.set(Integer.parseInt(args[4*i - 3]),Person.createMale(args[4*i - 2], new Date(doDate(args[4*i]))));
                        }
                        else if (args[4*i - 1].equals("ж"))
                        {
                            allPeople.set(Integer.parseInt(args[4*i - 3]),Person.createFemale(args[4*i - 2], new Date(doDate(args[4*i]))));
                        }
                        else
                        {
                            System.out.println("Неверно указан формат!");
                        }
                    }
                }

                break;

            case "-d":

                synchronized (allPeople)
                {
                    for (int i = 1; i <= args.length - 1; i++)
                    {
                        allPeople.set(Integer.parseInt(args[i]), allPeople.get(Integer.parseInt(args[i])).reset());
                    }
                }

                break;

            case "-i":

                synchronized (allPeople)
                {
                    for (int i = 1; i <= args.length - 1; i++)
                    {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])));
                    }
                }

                break;
        }
    }
}
