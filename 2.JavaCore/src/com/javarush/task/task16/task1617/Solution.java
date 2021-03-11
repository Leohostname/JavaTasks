package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution
{
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException
    {
        int secs = numSeconds;
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        if (secs <= 3)
        {
            System.out.println("Марш!");
        }
        else
        {
            System.out.println("Прервано!");
        }

        clock.interrupt();
    }

    public static class RacingClock extends Thread
    {
        public RacingClock()
        {
            start();
        }

        public void run()
        {
            for (int i = numSeconds; i >= 1; i--)
            {
                System.out.println(i);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                numSeconds--;
            }
        }
    }
}
