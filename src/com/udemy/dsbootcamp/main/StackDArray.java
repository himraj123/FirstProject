package com.udemy.dsbootcamp.main;

import java.util.Arrays;

public class StackDArray<T> {
    private Object[] data;
    private int size;
    private int initialCapacity;
    private int top;

    public StackDArray(int capacity){
        initialCapacity=capacity;
        size=0;
        data = new Object[initialCapacity];
        top=-1;
    }

    public boolean isStackEmpty(){
        return top==-1;
    }

    public void push(T value){
        if(size==data.length-1){
            resize();
        }
        top++;
        data[top]=value;
        size++;
    }

    public void resize() {
        initialCapacity=initialCapacity*2;
        data= Arrays.copyOf(data,initialCapacity);
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
