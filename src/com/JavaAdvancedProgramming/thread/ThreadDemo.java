package com.JavaAdvancedProgramming.thread;
//演示线程 并发性 、线程的抢占式执行

//继承Thread类
public class ThreadDemo extends Thread{
  private int i=0;
  //重写run方法
  @Override
  public void run() {
    for (; i < 20; i++) {
      //输出线程名+序号
      System.out.println(getName()+i);
    }
  }


}
