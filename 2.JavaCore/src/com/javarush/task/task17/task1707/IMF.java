package com.javarush.task.task17.task1707;


import javax.lang.model.type.NullType;

public class IMF
{

    private static IMF imf;

    public static IMF getFund()
    {
        synchronized(new IMF())
        {
            try
            {
                if (imf.toString().equals("null")) imf = new IMF();
            }
            catch (NullPointerException e)
            {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF()
    {
    }
}
