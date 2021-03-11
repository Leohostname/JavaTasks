package com.javarush.task.task14.task1417;
import com.javarush.task.task14.task1417.Money;

public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "USD";
    }
}
