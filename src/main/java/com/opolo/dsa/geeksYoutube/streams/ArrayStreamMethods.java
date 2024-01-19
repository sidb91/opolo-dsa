package com.opolo.dsa.geeksYoutube.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayStreamMethods {
    
    public static void main(String[] args) {
        
        List<Employee> empList = Arrays.asList(
            new Employee(1, "Adam"),
            new Employee(2, "Barry"),
            new Employee(3, "Cathy"),
            new Employee(4, "Dan")
        );

        Optional<Employee> result = empList.stream().findFirst();

        System.out.println(result.get().getName());


    }
}
