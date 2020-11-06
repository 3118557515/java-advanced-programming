package com.JavaAdvancedProgramming.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
  public static void main(String[] args) {
    //创建file对象，指向要操作的文件
    File file = new File("test/静夜思.txt");
    //创建FileOutStream实例
    FileOutputStream fos = null;
    try {
      //创建FileOutStream实例
     fos = new FileOutputStream(file);
     //创建要写入的字符串
      String str="鬼知道我要干什么！";
      //将字符串转换为字节数组
      byte [] bytes=str.getBytes();
      //将字节数组写入到文件中

        fos.write(bytes);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      //关闭资源
      if (fos!=null){
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
