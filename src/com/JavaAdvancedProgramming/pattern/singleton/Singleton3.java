package com.JavaAdvancedProgramming.pattern.singleton;

/**
 * 单例模式----Holder模式
 * 优点：线程安全；不会在程序执行时就创建实例，节约资源
 * 缺点：容易被放射攻击
 */
public class Singleton3 {
    private Singleton3(){

    }
    //创建内部类，程序执行时会加载这个内部类，但是不会运行创建实例的代码
    private static class Holder{
        //在内部类中创建实例
        private static Singleton3 INSTANCE=new Singleton3();
    }

    public static Singleton3 getInstance(){
        //调用此方法时 返回内部类中创建的实例
        return Holder.INSTANCE;
    }
}
