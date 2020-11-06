package com.JavaAdvancedProgramming.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
  public static void main(String[] args) {
    //创建file操作对象，指向要操作的文件
    File file = new File("test/静夜思.txt");
    //创建FileInputStream实例
    FileInputStream fis=null;
    try {
      //创建FileInputStream实例
      fis = new FileInputStream(file);
      //创建一个字节数组，用来存放读取到的文件
      byte[] bytes=new byte[(int) file.length()];
      //读取file指向的文件，并把它存到字节数组中
      fis.read(bytes);

      //把字节数组转化成字符串
      String str = new String(bytes);
      //输出字符串
      System.out.println(str);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      //关闭资源
      if (fis!=null){
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
