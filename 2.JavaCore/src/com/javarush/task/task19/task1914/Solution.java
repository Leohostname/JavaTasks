package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArray));

        testString.printSomething();
        System.setOut(consoleStream);

        String example = byteArray.toString();
        String[] elements = example.trim().split(" ");

        int firstNumber = Integer.parseInt(elements[0]);
        String sign = elements[1];
        int secondNumber = Integer.parseInt(elements[2]);
        int result = 0;

        switch (sign)
        {
            case "+":
                result = firstNumber + secondNumber;
                break;

            case "*":
                result = firstNumber * secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;
        }

        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        byteArray.close();
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("3 + 6 = ");
        }
    }
}