package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution
{
    public static Map<String, String> countries = new HashMap<String, String>();

    static
    {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args)
    {

    }

    public static class DataAdapter implements RowItem
    {
        private final Customer customer;
        private final Contact contact;

        public DataAdapter(Customer customer, Contact contact)
        {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode()
        {
            for (Map.Entry<String, String> entry : countries.entrySet())
            {
                if (entry.getValue().equals(this.customer.getCountryName())) return entry.getKey();
            }

            return null;
        }

        @Override
        public String getCompany()
        {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {
            return this.contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName()
        {
            return this.contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString()
        {
            String phoneNumber = this.contact.getPhoneNumber();
            String firstPart = phoneNumber.substring(1, phoneNumber.indexOf("("));
            String secondPart = phoneNumber.substring(phoneNumber.indexOf("(") + 1, phoneNumber.indexOf(")"));
            String[] thirdPartArr = phoneNumber.substring(phoneNumber.indexOf(")") + 1).split("-");
            String thirdPart = "";

            for (String part : thirdPartArr) thirdPart = thirdPart.concat(part);

            String finalPhoneNumber = firstPart + secondPart + thirdPart;

            String output = String.format("callto://+%s", finalPhoneNumber);

            return output;
        }
    }

    public interface RowItem
    {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: call to://+380501234567
    }

    public interface Customer
    {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact
    {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}