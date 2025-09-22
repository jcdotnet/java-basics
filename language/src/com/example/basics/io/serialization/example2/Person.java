package com.example.basics.io.serialization.example2;

import java.io.*;

public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonMain {
    public static void main(String[] args) {
        // write
        try {
            Person person = new Person("John Doe", 35);
            FileOutputStream fileOutputStream = new FileOutputStream("files/person.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Person has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read
        try {
            FileInputStream fileInputStream = new FileInputStream("files/person.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) inputStream.readObject();
            System.out.println("Deserialized Person name: " + person.getName());
            System.out.println("Deserialized Person age: " + person.getAge());
            inputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

