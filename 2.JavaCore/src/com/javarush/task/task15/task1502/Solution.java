package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution
{
    public static void main(String[] args)
    {
        Thread myNewThread = new Thread(new Cat());

        myNewThread.start();

        System.out.println("Начало главного потока");

        System.out.println("Конец главного потока");
    }
}


class Cat implements Runnable
{
    public void run()
    {
        System.out.println("Котик бежит в побочном потоке");
    }
}