package com.opolo.dsa.geeksYoutube.objects;

class Employee {

    private String name;
    private int regNo;

    public Employee() {
    }

    public Employee(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setName(int regNo) {
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || (o.getClass() != this.getClass())) {
            return false;
        }

        if (o == this) {
            return true;
        }

        Employee e = (Employee) o;

        return this.getRegNo() == e.getRegNo();
    }
}

public class ObjectEquivalenceEquals {

    public static void main(String[] args) {

        Employee e1 = new Employee("Adam", 1234);
        Employee e2 = new Employee("Britney", 1234);

        System.out.println(e1.equals(e2));
    }
}
