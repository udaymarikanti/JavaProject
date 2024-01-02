package com.Neoteric.student.model;

public class MemoryStudentEntity {
    String name, contrey;


    public String getName() {
        return name;
    }

    public String getContrey() {
        return contrey;
    }

    public MemoryStudentEntity(String name, String contrey) {
        this.name = name;
        this.contrey = contrey;
    }


    @Override
    public String toString() {
        return "MemoryStudentService{" +
                "name='" + name + '\'' +
                ", contrey='" + contrey + '\'' +
                '}';
    }
}
