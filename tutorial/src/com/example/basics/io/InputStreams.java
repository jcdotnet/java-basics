package com.example.basics.io;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class InputStreams {
    public static void main(String[] args) /*throws IOException*/ {

        try {
            // FileInputStream file = new FileInputStream("files/input.txt");
            Reader input = new FileReader("files/input.txt");
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Hello, " + name);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("Your name is %s and your age is %d", name, age);
        */
        try {
            URL url = new URL("https://example.com");
            InputStream inputStream = url.openStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
