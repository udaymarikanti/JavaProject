package com.Neoteric.student.service;

public class schoolService {
    private static int teachercount=20;
    private static  schoolService schoolservice;
    public schoolService(){
        System.out.println("From counting in School Teachers: "+teachercount);

    }

    public int getTeachercount(){
        return teachercount;

    }
    public int getadd(){
        return teachercount=teachercount+1;
    }
    public int getremove(){
        return teachercount=teachercount-1;
    }

}
