package com.maventest;

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Mtest {
    @Test
    public void testAdd() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("M.xml");
        context.start();
        //System.in.read();
        M m = (M)context.getBean("m");
        //assertEquals(5,m.addNum(2, 3));
        Assert.assertEquals(5,m.addNum(2,3));
    }

    @Test
    public void testAdd_fail() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("M.xml");
        context.start();
        //System.in.read();
        M m = (M)context.getBean("m");
        //assertEquals(5,m.addNum(2, 3));
        Assert.assertEquals(6,m.addNum(2,3));
    }
}
