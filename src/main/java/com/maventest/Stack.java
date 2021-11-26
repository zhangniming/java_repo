package com.maventest;

public class Stack {
    private String p[];
    final private int length = 100;
    private int top = 0;
    public Stack()
    {
        p = new String[length];
    }
    public void push(String good) throws InterruptedException
    {
        while(top + 1 >= length)
        {
            this.wait();
        }
        p[top++] = good;
        this.notifyAll();
    }
    public String pop() throws InterruptedException
    {
        while(top == 0)
        {
            this.wait();
        }
        this.notifyAll();
        return p[top--];
    }
}
