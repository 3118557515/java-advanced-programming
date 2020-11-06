package com.JavaAdvancedProgramming.thread;

//这是一个取钱的线程类，继承Thread类
public class GetMoneyThreadDemo extends Thread {
  private Account account;
  private int getmoney;

  //一个有参构造方法，创建此类对象的时候传进 账户 和 取钱金额 这两个参数
  public GetMoneyThreadDemo(Account account, int getmoney) {
    this.account = account;
    this.getmoney=getmoney;
  }

  //重写run方法，方法里调用account对象的getmoney方法，方法传参取钱金额
  @Override
  public void run() {
      account.getmoney(getmoney);
  }


}
