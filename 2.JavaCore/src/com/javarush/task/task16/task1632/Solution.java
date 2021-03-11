package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution
{
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new firstThread());
        threads.add(new secondThread());
        threads.add(new thirdThread());
        threads.add(new forthThread());
        threads.add(new fifthThread());
    }

    public static void main(String[] args)
    {

    }

    public static class firstThread extends Thread
    {
        @Override
        public void run()
        {
            while (true)
            {
                System.out.print("");
            }
        }
    }

    public static class secondThread extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                Thread.sleep(0);
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class thirdThread extends Thread
    {
        @Override
        public void run()
        {
            while (true)
            {
                try
                {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
                catch (InterruptedException e){}
            }
        }
    }

    public static class forthThread extends Thread implements Message
    {
        @Override
        public void run()
        {
            while (true)
            {
                System.out.print("");
            }
        }

        @Override
        public void showWarning()
        {
            Thread.currentThread().interrupt();
        }
    }

    public static class fifthThread extends Thread
    {
        @Override
        public void run()
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            int allCounts = 0;

            while (true)
            {
                try
                {
                    line = reader.readLine();

                    if (line.equals("N"))
                    {
                        System.out.println(allCounts);
                        break;
                    }

                    allCounts += Integer.parseInt(line);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}