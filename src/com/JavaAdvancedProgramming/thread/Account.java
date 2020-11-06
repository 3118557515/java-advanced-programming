package com.JavaAdvancedProgramming.thread;

//这是一个账户类，有账户名和余额这两个变量
public class Account {
 private String account;
 private int banlance;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public int getBanlance() {
    return banlance;
  }

  public void setBanlance(int banlance) {
    this.banlance = banlance;
  }

  public Account() {
  }

  public Account(String account, int banlance) {
    this.account = account;
    this.banlance = banlance;
  }

  //同步方法，调用这个同步方法时会给Account这个对象加锁，运行结束会释放锁
  public synchronized void getmoney(int getmoney){
    if (this.getBanlance()>=getmoney){
      System.out.println(Thread.currentThread().getName()+"取款："+getmoney);
      this.setBanlance(this.getBanlance()-getmoney);
      System.out.println(this.getAccount()+"余额："+this.getBanlance());
    }else {
      System.out.println("对不起，余额不足！");
    }
  }
}
