package com.JavaAdvancedProgramming.thread;

public class ThreadLocalAccount {
  private String name;
  private ThreadLocal<Double> balance=new ThreadLocal<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThreadLocal<Double> getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance.set(balance);
  }

  public ThreadLocalAccount() {
  }

  public ThreadLocalAccount(String name, double balance) {
    this.name = name;
    this.balance.set(balance);
  }
}
