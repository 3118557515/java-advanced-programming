package com.JavaAdvancedProgramming.network.chat;

import java.io.IOException;
import java.net.Socket;

public class ChatClientSocket {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("192.168.10.75",8889);

            new Thread(new ReceiveRunnable(socket)).start();
            new Thread(new SendRunnable(socket)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
