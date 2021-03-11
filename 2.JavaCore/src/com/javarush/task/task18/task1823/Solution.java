package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> filePaths = new ArrayList<>();

        String filePath = reader.readLine();

        while (!filePath.equals("exit"))
        {
            filePaths.add(filePath);
            filePath = reader.readLine();
        }

        ArrayList<ReadThread> threads = new ArrayList<>();

        for (String file : filePaths)
        {
            threads.add(new ReadThread(file));
        }

        reader.close();
    }

    public static class ReadThread extends Thread
    {
        private volatile String filePath;

        public ReadThread(String fileName)
        {
            filePath = fileName;
            start();
        }

        @Override
        public void run()
        {
            try
            {
                FileInputStream fisForFile = new FileInputStream(this.filePath);
                byte[] buffer = new byte[fisForFile.available()];
                fisForFile.read(buffer);

                HashMap<Byte, Integer> map = new HashMap<>();

                for (byte b : buffer) map.putIfAbsent(b, 0);

                for (Map.Entry<Byte, Integer> entry : map.entrySet())
                {
                    for (byte b : buffer)
                    {
                        byte key = entry.getKey();

                        if (b == key) entry.setValue(entry.getValue() + 1);
                    }
                }

                int maxValue = Collections.max(map.values());
                byte findByte = 0;

                for (Map.Entry<Byte, Integer> entry : map.entrySet())
                {
                    if (maxValue == entry.getValue())
                    {
                        findByte = entry.getKey();
                    }
                }

                resultMap.put(filePath, (int) findByte);
                fisForFile.close();
            }
            catch (IOException ignored){}
        }
    }
}
