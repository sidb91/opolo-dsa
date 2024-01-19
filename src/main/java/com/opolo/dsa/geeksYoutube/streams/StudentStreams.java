package com.opolo.dsa.geeksYoutube.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreams {

    public static void main(String[] args) {

        List<Student> students = Stream.of(
                new Student(1, "Adam", 10,
                        "M", "Arts", "Arlington", 75, Arrays.asList("adam@test.com")),
                new Student(2, "Billy", 11,
                        "M", "Commerce", "Denver", 77, Arrays.asList("billy@test.com")),
                new Student(3, "Cindy", 14,
                        "M", "Science", "Cally", 80, Arrays.asList("cindy@test.com")),
                new Student(4, "Dan", 20,
                        "M", "Arts", "Denver", 79, Arrays.asList("dan@test.com"))
        ).collect(Collectors.toList());

        //rank is between 75 and 80
        List<Student> studentsRank = students.stream()
                .filter(s -> s.getRank() > 75 && s.getRank() < 80)
                .collect(Collectors.toList());
        //studentsRank.forEach(s -> System.out.println(s.getFirstName()));

        //sort students by name
        List<Student> studentsByName = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        //System.out.println(studentsByName);

        //collect all the contacts
        List<String> contacts = students.stream()
                .flatMap(student -> student.getContacts().stream())
                .collect(Collectors.toList());
        //one-one = map
        //one-many = flatMap
        //System.out.println(contacts);

        //group students by department
        Map<String, List<Student>> depts = students.stream().collect(Collectors.groupingBy(Student::getDept));
        //System.out.println(depts);

        Map<String, Long> deptStudentCount = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        //System.out.println(deptStudentCount);

        //find the student with the highest rank in each dept
        Map<String, Optional<Student>> highestRanks = students.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));
        //System.out.println(highestRanks);

        //find the student with the second highest rank
        Student student = students.stream().sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst().orElseThrow();
        System.out.println(student);

        //any students who stay in Denver
        boolean anyStudentInDenver = students.stream()
                .anyMatch(s -> s.getCity().equalsIgnoreCase("Denver"));
    }
}
