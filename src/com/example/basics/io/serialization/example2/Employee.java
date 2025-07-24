package com.example.basics.io.serialization.example2;

import java.io.*;

public class Employee implements Serializable {

    private String name;
    private int age;
    private transient int ssn;

    public Employee(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSsn() {
        return ssn;
    }
}

class EmpoyeeMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "files/employee.ser";
        Employee employee = new Employee("John Doe", 30, 123456789);

        // Write the Employee object to a file
        FileOutputStream fileOut = new FileOutputStream(filePath);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(employee);
        out.close();
        fileOut.close();

        // Read the Employee object from the file
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employee deserializedEmployee = (Employee) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Name: " + deserializedEmployee.getName());
        System.out.println("Age: " + deserializedEmployee.getAge());
        System.out.println("SSN: " + deserializedEmployee.getSsn());
    }
}