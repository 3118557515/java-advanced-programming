package com.JavaAdvancedProgramming.thread;

//这是火车站类，num属性是剩余火车票
public class TrainStation {
  private int num;

  public TrainStation() {
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public TrainStation(int num) {
    this.num = num;
  }

  //定义flag变量，用来标记卖出了第几张票
  int flag=1;
  //定义同步方法，运行这个同步方法的时候会把火车站类锁上，传参是当次线程（售票窗口）要卖出的票数
  public synchronized void getTicket(int getTicketNum){
    //如果剩余票数大于等于当次要卖出的票数，进入语句
    if (this.num>=getTicketNum){
      //输出线程名字（售票窗口名）和售出了第几张
      System.out.println(Thread.currentThread().getName()+"售出第："+flag+"张票！");
      //线程运行成功一次flag加一，代表卖出了第几张
      flag+=1;
      //改变剩余票数，剩余票数等于剩余票数减去当次售票窗口要卖出的票数
      this.num-=getTicketNum;
    }

  }
}
