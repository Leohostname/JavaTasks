package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution
{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        PrintStream consoleStream = System.out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        FileOutputStream fosForFile = new FileOutputStream(fileName);

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArray));

        testString.printSomething();
        System.setOut(consoleStream);

        fosForFile.write(byteArray.toByteArray());
        String content = byteArray.toString();
        System.out.println(content);

        reader.close();
        fosForFile.close();
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

