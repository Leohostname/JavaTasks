package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution
{
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader(args[0]);

        String fileContent = "";

        while (file.ready())
        {
            fileContent += (char) file.read();
        }

        file.close();

        String[] contentArray = fileContent.split("\n");

        for (String s : contentArray)
        {
            String[] localArray = s.split(" ");
            String name = "";

            for (int j = 0; j < localArray.length - 3; j++) {
                name += localArray[j] + " ";
            }

            int year = Integer.parseInt(localArray[localArray.length - 1].trim());
            int month = Integer.parseInt(localArray[localArray.length - 2]) - 1;
            int day = Integer.parseInt(localArray[localArray.length - 3]);

            PEOPLE.add(new Person(name.trim(), new Date(year - 1900, month, day)));
        }
    }
}
