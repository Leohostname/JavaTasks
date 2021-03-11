package com.javarush.task.task11.task1110;

/* 
Не забываем инкапсулировать
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat
    {
        private String name;
        private int age;
        private int speed;
        private int weight;

        public Cat(String name, int age, int weight) {

        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
