package com.JavaAdvancedProgramming.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
  public static void main(String[] args) {

    //1.创建file对象
    File file = new File("test");


    //2.判断file对象指向的文件是否存在，不存在就创建一个
    if (!file.exists()){
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    //3.获取文件名
    String fileName=file.getName();
    System.out.println("文件名："+fileName);

    //4.获取文件路径
    String path=file.getPath();
    String absolutePath=file.getAbsolutePath();
    System.out.println("相对路径是:"+path+"\n"+"绝对路径是："+absolutePath);

    //5.获取文件的大小
    long length=file.length();
    System.out.println("文件大小是："+length);

    //6.判断该file对象是否为文件，是否为文件夹
    System.out.println("判断是否为文件："+file.isFile());
    System.out.println("判断是否为文件夹："+file.isDirectory());

    //7.把满足过滤条件的文件存到数组里，输出文件名
    File[] files=file.listFiles( new MyFileNameFilter());
    for (File file1:files) {
      System.out.println(file1.getName());
    }
  }
}
