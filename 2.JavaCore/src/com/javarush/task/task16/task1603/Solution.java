package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution
{
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args)
    {
        Thread firstThread = new Thread(new SpecialThread());
        Thread secondThread = new Thread(new SpecialThread());
        Thread thirdThread = new Thread(new SpecialThread());
        Thread forthThread = new Thread(new SpecialThread());
        Thread fifthThread = new Thread(new SpecialThread());

        list.add(firstThread);
        list.add(secondThread);
        list.add(thirdThread);
        list.add(forthThread);
        list.add(fifthThread);
    }

    public static class SpecialThread implements Runnable
    {
        public void run()
        {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
