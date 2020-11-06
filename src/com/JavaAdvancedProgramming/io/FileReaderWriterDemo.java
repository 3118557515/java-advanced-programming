package com.JavaAdvancedProgramming.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
  public static void main(String[] args) {
    FileReader fileReader=null;
    FileWriter fileWriter=null;
    try {
      fileReader = new FileReader("test/静夜思.txt");
      fileWriter = new FileWriter("test/新静夜思.txt");
      char[] chars = new char[1];
      while (fileReader.read(chars)!=-1){
        System.out.print(new String(chars));

        fileWriter.write(new String(chars));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      fileReader.close();
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
