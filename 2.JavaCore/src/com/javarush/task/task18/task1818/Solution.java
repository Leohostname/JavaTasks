package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fosForFirstFile = new FileOutputStream(reader.readLine(), true);

        FileInputStream fisForSecondFile = new FileInputStream(reader.readLine());

        FileInputStream fisForThirdFile = new FileInputStream(reader.readLine());

        while(fisForSecondFile.available() > 0) fosForFirstFile.write(fisForSecondFile.read());
        while(fisForThirdFile.available() > 0) fosForFirstFile.write(fisForThirdFile.read());

        reader.close();
        fosForFirstFile.close();
        fisForSecondFile.close();
        fisForThirdFile.close();
    }
}
