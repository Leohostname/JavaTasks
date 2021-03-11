package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
*/

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Solution
{
    public static void main(String[] args)
    {
        Human human = new Human();
        System.out.println(human);
    }

    public interface Worker
    {
        void workLazy();
    }

    public interface Businessman extends Miner
    {
        void workHard();
    }

    public interface Secretary
    {
        void workLazy();
    }

    public interface Miner
    {
        static void workVeryHard(){};
    }

    public static class Human implements Worker, Businessman, Secretary
    {

        public void workHard()
        {
        }

        public void workLazy()
        {
        }

    }
}
