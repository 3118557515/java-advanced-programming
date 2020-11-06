package com.JavaAdvancedProgramming.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
  public static void main(String[] args) {
    try {
      InetAddress inetAddress=InetAddress.getByName("192.168.10.188");
      String str=inetAddress.getHostAddress();
      System.out.println(str);
      String str1=inetAddress.getCanonicalHostName();
      System.out.println(str1);
      String str2=inetAddress.getHostName();
      System.out.println(str2);
      byte[] str3=inetAddress.getAddress();
      System.out.println(str3.length);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
