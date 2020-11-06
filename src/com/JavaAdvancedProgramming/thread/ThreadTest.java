package com.JavaAdvancedProgramming.thread;

public class ThreadTest {
  public static void main(String[] args) {
    //创建线程
    ThreadDemo threadA = new ThreadDemo();
    //设置线程名字
    threadA.setName("线程A");
    //设置线程休眠200毫秒
    try {
      threadA.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //运行线程
    threadA.start();

    ThreadDemo threadB=new ThreadDemo();
    threadB.setName("线程B");
    threadB.start();

    ThreadDemo threadC=new ThreadDemo();
    threadC.setName("线程C");
    threadC.start();

    //输出当前线程的名字+序号
    for (int i = 0; i < 20; i++) {
      System.out.println(Thread.currentThread().getName()+i);

    }
  }
}
