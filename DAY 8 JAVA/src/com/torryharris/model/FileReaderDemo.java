package com.torryharris.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File input=new File("input.txt");
        FileReader reader=new FileReader(input);
        char array[]=new char[(int)input.length()];
        reader.read(array);
        String data=new String(array);
        System.out.println(data);
        reader.close();

        data="Hello! This is  JAY PRASAD";
        FileWriter write=new FileWriter("output.txt");
        write.write(data);
        write.flush();
        write.close();
    }
}
