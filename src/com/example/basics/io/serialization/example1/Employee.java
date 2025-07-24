package com.example.basics.io.serialization.example1;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = -4860751527906284336L;

    private String name;
    private int id;

    private transient String password;  // This field will not be serialized
    private String fullName;

    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    // Getters and toString() for demonstration purposes
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}