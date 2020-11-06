package com.JavaAdvancedProgramming.network.chat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class GroupChat {
    private  ServerSocket serverSocket;

    public GroupChat(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void listener(){
        while (true){
            try {

                Socket socket= serverSocket.accept();
                new Thread(new ReceiveRunnable(socket)).start();
                new Thread(new SendRunnable(socket)).start();
            } catch (IOException e) {

            }
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8889);
            System.out.println("服务端创建成功");

            GroupChat groupChat = new GroupChat(serverSocket);
            groupChat.listener();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
