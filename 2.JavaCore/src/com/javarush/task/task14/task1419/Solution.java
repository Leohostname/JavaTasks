package com.javarush.task.task14.task1419;

import javax.management.IntrospectionException;
import javax.xml.crypto.MarshalException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        exceptions.add(new IntrospectionException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ActivationException());
        exceptions.add(new AlreadyBoundException());
        exceptions.add(new IllegalClassFormatException());
        exceptions.add(new MarshalException());
        exceptions.add(new InterruptedException());
        exceptions.add(new CertificateException());

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
