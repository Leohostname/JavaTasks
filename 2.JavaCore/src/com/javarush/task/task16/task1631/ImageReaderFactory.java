package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory
{
    public static ImageReader getImageReader(ImageTypes type)
    {
        try
        {
            switch (type)
            {
                case PNG:

                    return new PngReader();

                case BMP:

                    return new BmpReader();

                case JPG:

                    return new JpgReader();

                default:

                    throw new IllegalArgumentException("Unexpected value: " + type);
            }
        }
        catch (NullPointerException e)
        {
            throw new IllegalArgumentException("Unexpected value: " + type);
        }

    }
}
