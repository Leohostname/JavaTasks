package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        int length = 0;

        for (int i = 0; i < 10; i++)
        {
            String line = reader.readLine();
            list.add(line.toLowerCase());
            length += line.length();
        }

        char[] arrOfChar = new char[length];
        int index = 0;

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.get(i).length(); j++)
            {
                arrOfChar[index] = list.get(i).toCharArray()[j];
                index++;
            }
        }

        int[] countOfAlphabetTimes = new int[alphabet.size()];

        for (int count : countOfAlphabetTimes)
        {
            count = 0;
        }

        for (int t = 0; t < alphabet.size(); t++)
        {
            for (int i = 0; i < arrOfChar.length; i++)
            {
                if (alphabet.get(t).equals(arrOfChar[i]))
                {
                    countOfAlphabetTimes[t] += 1;
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++)
        {
            System.out.println(alphabet.get(i) + " " + countOfAlphabetTimes[i]);
        }
    }
}
