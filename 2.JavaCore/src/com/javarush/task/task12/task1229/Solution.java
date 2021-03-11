package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution
{

    public static void main(String[] args)
    {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public interface Businessman
    {
        void workHard();
    }

    public static class CTO extends Govnoed implements Businessman
    {

    }

    public static class Govnoed implements Businessman
    {

        @Override
        public void workHard() {

        }
    }
}
