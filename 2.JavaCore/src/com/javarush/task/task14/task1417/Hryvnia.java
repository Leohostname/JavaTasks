package com.javarush.task.task14.task1417;
import com.javarush.task.task14.task1417.Money;

public class Hryvnia extends Money
{
    public Hryvnia(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "UAH";
    }
}
