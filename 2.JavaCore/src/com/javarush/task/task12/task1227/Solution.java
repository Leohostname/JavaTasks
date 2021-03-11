package com.javarush.task.task12.task1227;

/* 
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly
    {
        public void fly();
    }

    public interface CanRun
    {
        public void run();
    }

    public interface CanSwim
    {
        public void swim();
    }

    public abstract class Duck implements CanRun, CanFly, CanSwim
    {

    }

    public abstract class Penguin implements CanRun, CanSwim
    {

    }

    public abstract class Toad implements CanSwim
    {

    }
}
