package com.opolo.dsa.udemy.model;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next; //pointer to the next node of the list

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        // return "EmployeeNode [employee=" + employee + ", next=" + next + "]";
        return employee.toString();
    }

}
