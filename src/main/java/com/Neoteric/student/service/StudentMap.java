package com.Neoteric.student.service;

public class StudentMap {
    int Rno;
    String name;

    public StudentMap(int rno, String name) {
        this.Rno = rno;
        this.name = name;
    }

    public int getRno() {
        return Rno;
    }

    public String getName() {
        return name;
    }

    public void setRno(int rno) {
        Rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }
}

