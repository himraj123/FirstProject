package com.udemy.dsbootcamp.main;

public class StackArray<T> {
    private Object[] data;
    private int size;
    private int initialCapacity;
    private int top;

    public StackArray(int capacity){
        initialCapacity=capacity;
        size=0;
        data = new Object[initialCapacity];
        top=-1;
    }

    public boolean isStackFull(){
        return size==data.length-1;
    }

    public boolean isStackEmpty(){
        return top==-1;
    }

    public void push(T value){
        if(isStackFull()){
            System.out.println("Stack is Full!!");
            return;
        }
        top++;
        data[top]=value;
        size++;
    }

    public T pop(){
        if(isStackEmpty()){
            System.out.println("Stack is Empty!!");
            return null;
        }
        T value=(T)data[top];
        top--;
        size--;
        return value;
    }
}
