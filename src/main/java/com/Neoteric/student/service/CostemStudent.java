package com.Neoteric.student.service;

import java.util.Objects;

public class CostemStudent {
    int roolNum;
    String name ;


    public int getRoolNum() {
        return roolNum;
    }

    public String getName() {
        return name;
    }
    public void setRoolNum(int roolNum) {
        this.roolNum = roolNum;
    }

    public void setName(String name) {
        this.name = name;
    }


  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostemStudent that = (CostemStudent) o;
        return roolNum == that.roolNum && Objects.equals(name, that.name) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roolNum, name, city);
    }*/

/*    public  int hashCode(){
        return 2;
    }*/
}
