package com.JavaAdvancedProgramming.network.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8889);
            System.out.println("服务端创建成功");

            Socket socket=serverSocket.accept();
            System.out.println("客户端连接成功");

            new Thread(new ReceiveRunnable(socket)).start();
            new Thread(new SendRunnable(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
