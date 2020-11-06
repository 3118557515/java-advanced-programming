package com.JavaAdvancedProgramming.thread;

public class RunnableTest {
  public static void main(String[] args) {
    RunnableDemo runnableDemo=new RunnableDemo();
    Thread thread = new Thread(runnableDemo);
    thread.setName("线程A");

    RunnableDemo runnableDemo1=new RunnableDemo();
    Thread thread1 = new Thread(runnableDemo1);
    thread1.setName("线程B");

    thread.start();
    thread1.start();
  }
}
