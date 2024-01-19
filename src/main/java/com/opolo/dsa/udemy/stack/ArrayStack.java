package com.opolo.dsa.udemy.stack;

import com.opolo.dsa.udemy.model.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){ //worst case for push O(n)
        //if stack is full then resize stack
        if (top == stack.length){
            Employee[] newArray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee e = stack[--top];
        stack[--top] = null;

        return e;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public void print(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane","Jones",1));
        stack.push(new Employee("John","Doe",2));
        stack.push(new Employee("Mary","Smith",3));
        stack.push(new Employee("Mike","Wilson",4));
        stack.push(new Employee("Bill","End",5));

        //stack.print();

        System.out.println(stack.peek()); //prints the topmost element in stack
    }
}
