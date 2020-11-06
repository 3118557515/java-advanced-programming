package com.JavaAdvancedProgramming.io;

import java.io.*;
//这是一个copy类，把一个文件copy到其他地方
public class CopyDemo {
  public static void main(String[] args) {
    //创建file操作对象1，指向要copy的文件
    File file = new File("test/静夜思.txt");
    //创建file操作对象2，指向copy到的地址
    File file1 = new File("test1/静夜思.txt");
    //创建输入输出实例
    FileInputStream fis=null;
    FileOutputStream fos=null;
    try {
      //创建输入实例
       fis = new FileInputStream(file);
       //创建一个字节数组，用来存放读取到的文件
      byte[] bytes = new byte[(int) file.length()];
      //读取file这个操作对象指向的文件，存放到bytes字节数组中
      fis.read(bytes);

      //创建输出实例
      fos = new FileOutputStream(file1);
      //把字节数组bytes输出写入到file1
      fos.write(bytes);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      //关闭资源
      try {
        if (fos!=null){
          fos.close();
        }
        if (fis!=null){
          fis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
