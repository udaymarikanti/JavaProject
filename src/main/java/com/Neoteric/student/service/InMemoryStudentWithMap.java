package com.Neoteric.student.service;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentWithMap {

    // Map<String, Integer> studentMap = new HashMap<>();

       /* studentMap.put("Alice",25);
        studentMap.put("Bob",30);
        studentMap.put("Charlie",28);
   // int value = map.get(key);
    }

public InMemoryStudentWithMap(Map<String, Integer> studentMap) {
    this.studentMap = studentMap;
}

List<String,Integer> studentMap = numbers.stream()
        .map(match -> match.)
        .collect(Collectors.toList()); */






    public void addStudentsToHashMap(HashMap<Integer, String> map, StudentMap student) {
        map.put(student.getRno(), student.getName());
    }

   public HashMap<Integer, String> getStudentMap() {
        StudentMap s1 = new StudentMap(101, "Sudheer");
        StudentMap s2 = new StudentMap(102, "Kiran");
        StudentMap s3 = new StudentMap(103, "Dinesh");

        HashMap<Integer, String> map = new HashMap<Integer, String>();
       map.put(s1.getRno(),s1.getName());
       map.put(s2.getRno(),s2.getName());
       map.put(s3.getRno(),s3.getName());

//        addStudentsToHashMap(map, s1);
//        addStudentsToHashMap(map, s2);

        return map;
    }

    public String getNameByRollNo(int rollNo) {
        HashMap<Integer, String> studentName = getStudentMap();
        return studentName.get(rollNo);
    }
}






