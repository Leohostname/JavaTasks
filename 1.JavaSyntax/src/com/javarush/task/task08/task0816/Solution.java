package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution
{
    public static Map<String, Date> createMap() throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MARCH 1 2012"));
        map.put("Стронов", dateFormat.parse("JULY 31 2012"));
        map.put("Сидоров", dateFormat.parse("AUGUST 2 2012"));
        map.put("Сидельников", dateFormat.parse("FEBRUARY 15 2012"));
        map.put("Баранов", dateFormat.parse("DECEMBER 18 2012"));
        map.put("Ознобов", dateFormat.parse("OCTOBER 6 2012"));
        map.put("Вахтерников", dateFormat.parse("NOVEMBER 4 2012"));
        map.put("Пластырёнов", dateFormat.parse("FEBRUARY 3 2012"));
        map.put("Зазнобов", dateFormat.parse("MAY 10 2012"));


        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map)
    {
        map.entrySet().removeIf(value -> value.getValue().getMonth() >= 5 && value.getValue().getMonth() <= 7);
    }

    public static void main(String[] args) throws ParseException
    {

    }
}
