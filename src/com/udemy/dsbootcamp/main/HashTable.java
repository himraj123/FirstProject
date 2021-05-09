package com.udemy.dsbootcamp.main;

public class HashTable<T,E> {
    private static final int INITIAL_SIZE=16;
    private HashEntry<T,E>[] data;

    private class HashEntry<T,E>{
        T key;
        E value;
        HashEntry<T,E> next;
        public HashEntry(T key,E value){
            this.key=key;
            this.value=value;
        }
    }

    public HashTable(){
        data = new HashEntry[INITIAL_SIZE];
    }

    public void put(T key,E value){
        int index = getIndex(key);
        HashEntry<T,E> entry = new HashEntry<T,E>(key,value);
        if(data[index]==null){
            data[index]=entry;
        }
        else{
            HashEntry<T,E> entries = data[index];
            while(entries.next!=null){
                entries=entries.next;
            }
            entries.next=entry;
        }
    }

    public E get(T key){
        int index = getIndex(key);
        HashEntry<T,E> entries= data[index];
        if(entries!=null){
            while(!entries.key.equals(key) && entries.next!=null){
                entries=entries.next;
            }
            if(entries.next==null && !entries.key.equals(key)){
                return null;
            }
            return entries.value;
        }

        return null;
    }

    public int getIndex(T key){
        int hashKey = key.hashCode();
        return hashKey%INITIAL_SIZE;
    }
}
