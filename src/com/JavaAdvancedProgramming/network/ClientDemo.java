package com.JavaAdvancedProgramming.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
//这是一个客户端演示类
public class ClientDemo {
  public static void main(String[] args) {
    try {
      //连接服务端
      Socket socket = new Socket("192.168.10.75", 8888);

      //获取字节输入流，获取服务端字节输入
      InputStream inputStream=socket.getInputStream();

      //创建字符输入流，把获取的字节流装换成字符流
      InputStreamReader isp = new InputStreamReader(inputStream);


      //创建字符缓冲流，把读取到的字符放到缓冲区，这样才能在下面的操作中一条一条的获取数据，InputStreamReader是没有.readLine方法的
      BufferedReader bufferedReader = new BufferedReader(isp);
//      String str=bufferedReader.readLine();

      //输出数据
//      System.out.println(str);
      String str=null;
      while ((str=bufferedReader.readLine())!=null){

        System.out.println(str);
      }

      //关闭资源
      bufferedReader.close();
      isp.close();
      inputStream.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
