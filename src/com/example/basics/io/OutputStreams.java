package com.example.basics.io;

import java.io.*;
import java.net.Socket;

public class OutputStreams {
    public static void main(String[] args) throws IOException {
        try {
            String filename = "files/output.txt";
            FileOutputStream outputStream = new FileOutputStream(filename);
            String message = "Example file for I/O operations in Java";
            outputStream.write(message.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        String filename = "files/output.txt";
        FileOutputStream outputStream = new FileOutputStream(filename);
        String message = "Example file for I/O operations in Java";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(message.getBytes());
        bufferedOutputStream.flush();
        */

        OutputStream os = null;
        try {
            String filename = "files/output.txt";
            // create a new output stream
            os = new FileOutputStream(filename);
            // write bytes to the output stream
            String data = "Example file for I/O operations in Java";
            byte[] bytes = data.getBytes();
            os.write(bytes);
            // flush the output stream
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close the output stream
            if (os != null) {
                os.close();
            }
        }

        Writer writer = null;
        try {
            String filename = "files/output.txt";
            // create a new writer
            writer = new FileWriter(filename);
            // write characters to the output stream
            String data = "Example file for I/O operations in Java";
            writer.write(data);
            // flush the output stream
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close the output stream
            if (writer != null) {
                writer.close();
            }
        }

        String data = "Example file for I/O operations in Java";
        try {
            String filename = "files/section9/lesson3/output.txt";
            FileOutputStream fos = new FileOutputStream(filename);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String msg = "Example data that will be written to the network.";
        try {
            Socket socket = new Socket("sdf.org", 23);
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = msg.getBytes();
            outputStream.write(bytes);
            outputStream.close();
            socket.close();
            System.out.println("Data written to network.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
