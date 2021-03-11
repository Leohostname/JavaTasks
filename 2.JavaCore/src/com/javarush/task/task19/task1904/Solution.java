package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution
{

    public static void main(String[] args)
    {

    }

    public static class PersonScannerAdapter implements PersonScanner
    {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner)
        {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException
        {
            String[] person = this.fileScanner.nextLine().split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(person[5]), Integer.parseInt(person[4]) - 1, Integer.parseInt(person[3]));
            Date date = calendar.getTime();

            return new Person(person[1], person[2], person[0], date);
        }

        @Override
        public void close() throws IOException
        {
            fileScanner.close();
        }
    }
}
