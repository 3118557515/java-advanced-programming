package com.JavaAdvancedProgramming.thread;

//这是一个取钱测试类，定义了三个取钱线程，三个线程都从“小马”这个账户里取钱，演示加锁的用法
public class GetMoneyTest {
  public static void main(String[] args) {
    //创建一个账户对象，给定账户和余额
    Account account = new Account("小马", 1000);

    //实例化取钱线程类（创建线程），传入取钱账户和取款金额
    GetMoneyThreadDemo threadA = new GetMoneyThreadDemo(account, 700);
    //给线程一个名字
    threadA.setName("线程A");

    GetMoneyThreadDemo threadB = new GetMoneyThreadDemo(account, 600);
    threadB.setName("线程B");

    GetMoneyThreadDemo threadC = new GetMoneyThreadDemo(account, 300);
    threadC.setName("线程C");


    //就绪线程
    threadA.start();
    threadB.start();
    threadC.start();

    //这个方法是测试在new一个Thread对象的时候直接new Runnable这种编程方式
    new  Thread(new Runnable() {
      @Override
      public void run() {
        Thread.currentThread().setName("线程D");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
      }
    }).start();
  }
}
