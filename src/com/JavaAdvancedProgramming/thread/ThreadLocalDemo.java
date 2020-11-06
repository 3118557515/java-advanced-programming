package com.JavaAdvancedProgramming.thread;

public class ThreadLocalDemo {


  public static void main(String[] args) {
    ThreadLocalAccount account = new ThreadLocalAccount("张三",3000);
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(account.getBalance());
      }
    }).start();
  }
}
