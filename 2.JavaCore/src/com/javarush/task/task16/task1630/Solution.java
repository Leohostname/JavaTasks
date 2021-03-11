package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution
{
    public static String firstFileName;
    public static String secondFileName;

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static
    {
        try
        {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        catch (IOException ignored){}
    }

    public static void main(String[] args) throws InterruptedException, IOException
    {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException
    {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();

        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface
    {

        void setFileName(String fullFileName) throws IOException;

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private static String fileContent = "";

        @Override
        public void run()
        {
            try
            {
                setFileName(firstFileName);
            }
            catch (IOException ignored){}
        }

        @Override
        public void setFileName(String fullFileName) throws IOException
        {
            FileReader reader1 = new FileReader(fullFileName);
            Scanner scanner = new Scanner(reader1);

            while (scanner.hasNextLine())
            {
                fileContent += scanner.nextLine() + " ";
            }
        }

        @Override
        public String getFileContent()
        {
            return fileContent;
        }
    }
}
