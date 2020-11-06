package com.JavaAdvancedProgramming.pattern.singleton;

/**
 * 单例模式----饿汉模式
 * 优点：线程安全，代码简单
 * 缺点：程序执行就会实例化对象，浪费资源
 */
public class Singleton {
    //同一个类中可以调用私有方法，调用私有构造方法创建实例对象
    private static Singleton INSTANCE=new Singleton();
    //私有化构造方法，在其他类中不能创建新的实例对象
    private Singleton() {

    }
    //公有的方法，实现在其他类中获得实例化对象
    public  static Singleton getSingleton(){
        return  INSTANCE;
    }
}
