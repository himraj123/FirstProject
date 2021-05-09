package com.udemy.dsbootcamp.main;

public class Queue<T> {
    int size;
    private static class Node<T>{
        T data;
        Node next;
        public Node(T data){
            this.data=data;
        }
    }

    Node head;
    Node tail;

    public void add(T data){  //add back of the linked list
        Node newNode = new Node(data);
        if(tail!=null){
            tail.next = newNode;
        }
        tail=newNode;
        if(head==null){
            head=tail;
        }
        size++;
    }

    public T remove(){ // remove from front of the linked list
        if(head==null){
            throw new IllegalStateException("Stack Empty!!");
        }
        T data;
        data = (T)head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }

    public T getFirst(){
        if(head==null){
            throw new IllegalStateException("Empty list!");
        }
        else {
            return (T)head.data;
        }
    }

    public T getLast(){
        if(head == null){
            throw new IllegalStateException("Empty list!");
        }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            return (T)current.data;
        }
    }

    public int getSize(){
        return size;
    }

    public void clear(){
        head=null;
    }

}
