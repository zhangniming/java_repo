package com.maventest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("M.xml");
        context.start();
        System.in.read();
        //M m = (M)context.getBean("m");
        //System.out.println(m.addNum(5,4));
    }
}
