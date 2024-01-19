package com.opolo.dsa.udemy.linkedlist;

import com.opolo.dsa.udemy.model.Employee;
import com.opolo.dsa.udemy.model.EmployeeNode;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee emp) {
        EmployeeNode empNode = new EmployeeNode(emp); // created new node
        empNode.setNext(head); // new node to point to previous first node pointed by head
        head = empNode; // head now points to first node
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee johnDoe = new Employee("John", "Doe", 2);
        Employee marySmith = new Employee("Mary", "Smith ", 3);
        Employee mikeWilson = new Employee("Mike", "Wilson", 4);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

    }

}
