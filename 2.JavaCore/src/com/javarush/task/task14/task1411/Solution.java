package com.javarush.task.task14.task1411;
import com.javarush.task.task14.task1411.Person.Coder;
import com.javarush.task.task14.task1411.Person.Loser;
import com.javarush.task.task14.task1411.Person.Proger;
import com.javarush.task.task14.task1411.Person.User;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        do
        {
            key = reader.readLine();

            switch (key)
            {
                case "coder":

                    person = new Coder();
                    doWork(person);

                    break;

                case "proger":

                    person = new Proger();
                    doWork(person);

                    break;

                case "user":

                    person = new User();
                    doWork(person);

                    break;

                case "loser":

                    person = new Loser();
                    doWork(person);

                    break;

                default:

                    break;

            }
        }
        while (key.equals("coder") || key.equals("proger") || key.equals("loser") || key.equals("user"));
    }

    public static void doWork(Person person)
    {
        if (person instanceof Coder)
        {
            ((Coder) person).writeCode();
        }
        else if (person instanceof Proger)
        {
            ((Proger) person).enjoy();
        }
        else if (person instanceof User)
        {
            ((User) person).live();
        }
        else if (person instanceof Loser)
        {
            ((Loser) person).doNothing();
        }
    }
}
