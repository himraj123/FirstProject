package com.udemy.dsbootcamp.main;

import java.util.Arrays;

public class QueueDArray<T> {
    private Object[] data;
    private int size;
    private int initialCapacity;
    private int front, rear;

    public QueueDArray(int capacity){
        initialCapacity=capacity;
        size=0;
        data = new Object[initialCapacity];
        front=-1;
        rear=-1;
    }

    public boolean isQueueEmpty(){
        return front==-1||rear<front;
    }

    public void add(T value){
        if(size==initialCapacity-1){
            resize();
        }
        rear++;
        data[rear]=value;
        if(front==-1){
            front=0;
        }
        size++;
    }

    public void resize(){
        initialCapacity=initialCapacity*2;
        data= Arrays.copyOf(data,initialCapacity);
    }

    public T remove(){
        if(isQueueEmpty()){
            System.out.println("Queue is Empty!!");
            return null;
        }

        T value=(T)data[front];
        front++;
        size--;
        return value;
    }
}
