package com.udemy.dsbootcamp.main;

public class QueueArray<T> {
    private Object[] data;
    private int size;
    private int initialCapacity;
    private int front, rear;

    public QueueArray(int capacity){
        initialCapacity=capacity;
        size=0;
        data = new Object[initialCapacity];
        front=-1;
        rear=-1;
    }

    public boolean isQueueFull(){
        return size==initialCapacity-1;
    }

    public boolean isQueueEmpty(){
        return front==-1||rear<front;
    }

    public void add(T value){
        if(isQueueFull()){
            System.out.println("Queue is Full!!");
            return;
        }
        rear++;
        data[rear]=value;
        if(front==-1){
            front=0;
        }
        size++;
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
