package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution
{
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        char space = ' ';

        ArrayList<Character> listOfVowelChar = new ArrayList<Character>();
        ArrayList<Character> listOfConsonantChar = new ArrayList<Character>();

        char[] charArray = line.toCharArray();

        for (char ch : charArray)
        {
            if (isVowel(ch))
            {
                listOfVowelChar.add(ch);
            }
            else
            {
                listOfConsonantChar.add(ch);
            }
        }

        for (char ch : listOfVowelChar)
        {
            System.out.print(ch + " ");
        }

        System.out.println();

        listOfConsonantChar.removeIf(chr -> chr.equals(space));

        for (char ch : listOfConsonantChar)
        {
            System.out.print(ch + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character)
    {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels)
        {  // ищем среди массива гласных
            if (character == vowel)
            {
                return true;
            }
        }
        return false;
    }
}