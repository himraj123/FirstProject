package com.udemy.dsbootcamp.main;

import java.util.LinkedList;
import java.util.ListIterator;

public class HashTableVariant<T,E> {
    private static final int INITIAL_SIZE=16;
    private LinkedList<HashEntry<T,E>> data[];

    private class HashEntry<T,E>{
        T key;
        E value;
        HashEntry<T,E> next;
        public HashEntry(T key,E value){
            this.key=key;
            this.value=value;
        }
    }

    public HashTableVariant(){
        data = new LinkedList[INITIAL_SIZE];
        for(int i=0;i<INITIAL_SIZE;i++){
            data[i]= new LinkedList<>();
        }
    }

    public void put(T key,E value){
        int index = getIndex(key);
        HashEntry<T,E> entry = new HashEntry<T,E>(key,value);
        data[index].add(entry);
    }

    public E get(T key){
        E value = null;
        int index = getIndex(key);
        ListIterator<HashEntry<T,E>> iterator = data[index].listIterator();
        while(iterator.hasNext()){
            if(iterator.next().key==key){
                value=iterator.previous().value;
                break;
            }
        }
        return value;
    }

    public int getIndex(T key){
        int hashKey = key.hashCode();
        return hashKey%INITIAL_SIZE;
    }
}
