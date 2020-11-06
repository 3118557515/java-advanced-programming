package com.JavaAdvancedProgramming.thread;
//这里是火车站的线程类，继承Thread类
public class TrainStationThread extends Thread {
  //定义火车站变量以及售票窗口（线程）要出售的票数；
  private TrainStation trainStation;
  private int getTicketNum;

  //写一个构造方法，传进火车站对象以及售票窗口（线程）要出售的票数
  public TrainStationThread(TrainStation trainStation, int getTicketNum) {
    this.trainStation = trainStation;
    this.getTicketNum = getTicketNum;
  }

  //重写run方法，当火车站余票大于0时，调用火车站类中的获取车票方法
  @Override
  public void run() {
    while (trainStation.getNum()>0){
      //机房电脑垃圾，让线程休眠一会儿，以便调用其他线程（让每个窗口都卖一会儿票）
      try {
        Thread.sleep(0);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      trainStation.getTicket(getTicketNum);
    }
  }
}
