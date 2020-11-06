package com.JavaAdvancedProgramming.network.chat;

import java.io.*;
import java.net.Socket;

public class SendRunnable implements Runnable {
    private Socket socket;

    public SendRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str=null;

            while ((str=bufferedReader.readLine())!=null){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                if (str.equals("exit")){
                    bufferedReader.close();
                    inputStreamReader.close();
                    bufferedWriter.close();
                    writer.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
