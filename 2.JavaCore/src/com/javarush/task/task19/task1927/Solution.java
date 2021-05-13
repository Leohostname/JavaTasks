package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args)
    {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream infoArray = new ByteArrayOutputStream();
        PrintStream wrapperPrintStream = new PrintStream(infoArray);

        System.setOut(wrapperPrintStream);

        testString.printSomething();

        String[] arrForChange = infoArray.toString().split("\n");
        String[] finalArray = new String[arrForChange.length + arrForChange.length / 2];

        for (int i = 0, j = 0; i < arrForChange.length; i++)
        {
            finalArray[i + j] = arrForChange[i];
            if ((i + 1) % 2 == 0)
            {
                j++;
                finalArray[i + j] = "JavaRush - курсы Java онлайн";
            }
        }

        System.setOut(consoleStream);
        for (String line : finalArray) System.out.println(line);

        wrapperPrintStream.close();
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
