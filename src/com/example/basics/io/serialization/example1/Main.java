package com.example.basics.io.serialization.example1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
//        Employee emp = new Employee("John Doe", 123, "test");
//
//        // Serialization
//        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
//             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//
//            out.writeObject(emp);  // Serialize the object
//            System.out.println("Serialized data is saved in employee.ser");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Deserialization
        Employee deserializedEmp = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            deserializedEmp = (Employee) in.readObject();  // Deserialize the object
            System.out.println("Deserialized Employee: " + deserializedEmp);
            System.out.println("password=" + deserializedEmp.getPassword());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
