package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArray));
        testString.printSomething();

        System.setOut(consoleStream);

        String line = byteArray.toString().toUpperCase();
        System.out.println(line);

        byteArray.close();
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's a text for testing");
        }
    }
}
