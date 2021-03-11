package com.javarush.task.task18.task1826;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* 
Шифровка
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fisForFile = new FileInputStream(args[1]);
        InputStreamReader isrForFile = new InputStreamReader(fisForFile, StandardCharsets.UTF_8);
        FileOutputStream fosForFile = new FileOutputStream(args[2]);

        switch (args[0])
        {
            case "-e":

                char[] buffer = new char[fisForFile.available()];
                isrForFile.read(buffer);

                byte[] mirroredBuffer = new byte[buffer.length];

                for (int i = 0; i < buffer.length; i++)
                {
                    if ((byte)buffer[i] == (byte)97)
                    {
                        mirroredBuffer[i] = (byte)0;
                    }
                    else
                    {
                        mirroredBuffer[i] = (byte)buffer[i];
                    }
                }

                fosForFile.write(mirroredBuffer);

                break;

            case "-d":

                buffer = new char[fisForFile.available()];
                isrForFile.read(buffer);

                mirroredBuffer = new byte[buffer.length];

                for (int i = 0; i < buffer.length; i++)
                {
                    if ((byte)buffer[i] == (byte)0)
                    {
                        mirroredBuffer[i] = (byte)97;
                    }
                    else
                    {
                        mirroredBuffer[i] = (byte)buffer[i];
                    }
                }

                fosForFile.write(mirroredBuffer);

                break;

            default:

                throw new FileNotFoundException();
        }

        fisForFile.close();
        fosForFile.close();
        isrForFile.close();
    }
}
