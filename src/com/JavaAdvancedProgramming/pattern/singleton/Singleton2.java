package com.JavaAdvancedProgramming.pattern.singleton;

/**
 * 单例模式----懒汉模式
 * 优点：不会在程序执行时就实例化对象，按需调用，节约资源
 * 缺点：线程不安全（多个线程同时调用getInstance方法会判断失误，创建多个实例），可以通过加锁解决，但是会降低代码效率
 */
public class Singleton2 {
    //先创建变量，但是不实例化
    private static Singleton2 INSTANCE;

    private Singleton2(){

    }
    public  static Singleton2 getInstance(){
        if (INSTANCE==null){
            //如果变量instance为空，创建实例
            INSTANCE=new Singleton2();
        }
        return INSTANCE;
    }
}
