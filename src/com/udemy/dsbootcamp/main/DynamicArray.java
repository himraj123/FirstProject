package com.udemy.dsbootcamp.main;

import java.util.Arrays;

public class DynamicArray<T> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int capacity){
        initialCapacity=capacity;
        size=0;
        data = new Object[initialCapacity];
    }

    public T get(int index){
        if(index>size-1){
            throw new IndexOutOfBoundsException("Array index out of bound");
            //return (T)"Array index out of bound";
        }
        return (T)data[index];
    }

    public void insert(int index,T value){
        if(initialCapacity==size){
            resize();
        }
        for(int i=size;i>index;i--){
            data[i]=data[i-1];
        }
        data[index]=value;
        size++;
    }

    public void set(int index,T value){
        if(index<initialCapacity){
            data[index]=value;
        }
        else{
            throw new IndexOutOfBoundsException("Array index out of bound");
        }
        if(index==size){
            size++;
        }
    }

    public void add(T value){
        if(initialCapacity==size){
            resize();
        }

        data[size]=value;
        size++;
    }

    public void delete(int index){
        if(index!=size-1){
            for(int i=index;i<size-1;i++){
                data[i]=data[i+1];
            }
        }

        size--;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getCapacity(){
        return initialCapacity;
    }

    public int getSize(){
        return size;
    }

    public void resize(){
        initialCapacity=2*initialCapacity;
        data = Arrays.copyOf(data,initialCapacity);
    }

}
