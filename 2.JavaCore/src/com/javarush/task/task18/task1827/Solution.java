package com.javarush.task.task18.task1827;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        FileOutputStream listFileForWrite = new FileOutputStream(fileName, true);

        if (args.length == 4 && args[0].equals("-c"))
        {
            char[] buffer = new char[fileInputStream.available()];
            inputStreamReader.read(buffer);

            String fileContent = "";
            for (char ch : buffer) fileContent += ch;

            String[] lineItems = fileContent.split("\n");

            int id = buffer.length == 0? 0 : Integer.parseInt(lineItems[lineItems.length - 1].substring(0,8).trim()) + 1;

            String product = id == 0? String.format("%-8d%-30s%-8s%-4s", id, args[1], args[2], args[3]) :
                    "\n" + String.format("%-8d%-30s%-8s%-4s", id, args[1], args[2], args[3]);

            listFileForWrite.write(product.getBytes());
        }

        fileInputStream.close();
        inputStreamReader.close();
        listFileForWrite.close();
        reader.close();
    }
}
