package com.JavaAdvancedProgramming.thread;
//这里是火车站的测试类
public class
TrainStationTest {
  public static void main(String[] args) {
    //实例化火车站对象，通过构造方法初始化剩余票数为50张
    TrainStation trainStation = new TrainStation(50);
    //创建线程A，一个线程即一个窗口，穿入两个参数，第一个是线程操作的火车站对象，第二个是线程要出售的票数
    TrainStationThread threadA = new TrainStationThread(trainStation, 1);
    threadA.setName("1窗口");

    TrainStationThread threadB = new TrainStationThread(trainStation, 1);
    threadB.setName("2窗口");

    TrainStationThread threadC = new TrainStationThread(trainStation, 1);
    threadC.setName("3窗口");

    //就绪线程
    threadA.start();
    threadB.start();
    threadC.start();

  }
}
