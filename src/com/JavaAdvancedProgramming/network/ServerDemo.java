package com.JavaAdvancedProgramming.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//这是一个服务端演示类
public class ServerDemo {
  public static void main(String[] args) {
    try {

      //创建服务端
      ServerSocket serverSocket = new ServerSocket(8888);
      System.out.println("服务端创建成功！");

      //当客户端链接，取消阻塞，可返回一个Socket对象，方便与客户端通信
      Socket socket = serverSocket.accept();

      //继续执行
      System.out.println("客户端链接成功！");

      //创建输出流，向客户端发送数据
      OutputStream outputStream=socket.getOutputStream();
//      PrintWriter printWriter = new PrintWriter(outputStream);
//      printWriter.write("欢迎你，这里是肥仔落泪！");

      //输出
      OutputStreamWriter writer = new OutputStreamWriter(outputStream);
      BufferedWriter bufferedWriter = new BufferedWriter(writer);

      //获取服务端控制台输入
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      String str=null;
      //发送到客户端
      while ((str=bufferedReader.readLine())!=null){
        bufferedWriter.write(str);
        //换行
        bufferedWriter.newLine();
        //刷新
        bufferedWriter.flush();
        if (str.equals("exit")){
          break;
        }
      }

      //把消息发送到客户端
//      for (int i = 0; i < 10; i++) {
//        bufferedWriter.write("这里是第"+i+"个肥仔！");
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//      }


      //关闭资源
      serverSocket.close();
      System.out.println("服务端已关闭！");
//      printWriter.close();
      inputStreamReader.close();
      bufferedReader.close();
      bufferedWriter.close();
      writer.close();
      outputStream.close();

    } catch (IOException e) {

    }
  }
}
