package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream psForByteArray = new PrintStream(byteArray);

        System.setOut(psForByteArray);

        testString.printSomething();

        String workLine = byteArray.toString();

        System.setOut(consoleStream);

        workLine = workLine.replaceAll("\\D", "");

        System.out.println(workLine);

        psForByteArray.close();
        byteArray.close();
    }

    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
