package com.torryharris.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name:");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("Enter count of repetition:");
        int count= sc.nextInt();
        FileWriter write=new FileWriter("output.txt");
        for (int i=1;i<=count;i++){
            write.write(name+"\n");
            write.flush();
        }
        write.close();
    }
}
