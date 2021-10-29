package com.torryharris.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("input.txt");
        System.out.println("Content in Files are-----");
       int ch;
       while((ch=fis.read())!=-1){
           System.out.print((char)ch);
        }
       fis.close();
        FileOutputStream fos=new FileOutputStream("output.txt");
        String str="Hi This is JayPrasad";
        char charArray[]=str.toCharArray();
        for (char c:charArray) {
            fos.write((int)c);
        }
        fos.close();

    }
}
