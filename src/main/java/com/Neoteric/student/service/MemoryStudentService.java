package com.Neoteric.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MemoryStudentService {

    static Predicate<Integer> markpredicate = (mark) -> mark > 25;

    public List<Integer> getResult() {

        List<Integer> student = new java.util.ArrayList();
        student.add(10);
        student.add(20);
        student.add(30);
        student.add(40);

        List<Integer> streamPassedStudent = student.stream()
                .filter(number -> markpredicate.test((Integer) number))
                .collect(Collectors.toList());
        System.out.println("stream passed student" + streamPassedStudent);
        return streamPassedStudent;
    }









   /* static Predicate<MemoryStudentService> namesPredicate = (names) -> names.getContrey().equals("india") ;
    public static  void main(String[] args) {
        List<MemoryStudentEntity> conteryNames = new ArrayList<>();
        conteryNames.add(new MemoryStudentEntity("uday","india"));
        conteryNames.add(new MemoryStudentEntity("kiran","india"));
        conteryNames.add(new MemoryStudentEntity("naveen","india"));
        conteryNames.add(new MemoryStudentEntity("ravi","ame"));

        // List<String> matchedNames = new ArrayList<>();

        List<StudentDetailsString> preadicateMatchedNames = conteryNames.stream()
                .filter(namesPredicate)
                .collect(Collectors.toList());
        System.out.println(preadicateMatchedNames); */

}






