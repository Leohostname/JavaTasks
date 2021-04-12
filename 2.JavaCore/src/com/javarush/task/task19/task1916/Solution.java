package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution
{
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = console.readLine();
        String secondFile = console.readLine();
        console.close();

        FileReader firstReader = new FileReader(firstFile);
        FileReader secondReader = new FileReader(secondFile);

        String firstContent = "";
        String secondContent = "";

        while (firstReader.ready()) firstContent += (char) firstReader.read();
        while (secondReader.ready()) secondContent += (char) secondReader.read();
        firstReader.close();
        secondReader.close();

        String[] firstArray = firstContent.split("\n");
        String[] secondArray = secondContent.split("\n");

        for (int i = 0; i < firstArray.length; i++)
        {
            String first = firstArray[i];
            String second = secondArray[i];

            if (first.equals(second))
            {
                lines.add(new LineItem(Type.SAME, first));
            }
            else if (first.getBytes()[0] == 13)
            {
                lines.add(new LineItem(Type.ADDED, second));
            }
            else if (second.getBytes()[0] == 13)
            {
                lines.add(new LineItem(Type.REMOVED, first));
            }
        }

        for (LineItem lineItem : lines) System.out.println(lineItem.type.toString() + " " + lineItem.line);

    }


    public enum Type
    {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem
    {
        public Type type;
        public String line;

        public LineItem(Type type, String line)
        {
            this.type = type;
            this.line = line;
        }
    }
}
