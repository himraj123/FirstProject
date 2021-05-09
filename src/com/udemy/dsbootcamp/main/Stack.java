package com.udemy.dsbootcamp.main;

public class Stack<T> {
    int size;
    private static class Node{
        Object data;
        Node next;
        public Node(Object data){
            this.data=data;
        }
    }

    Node head;

    public void push(T data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public T pop(){
        if(head==null){
            throw new IllegalStateException("Stack Empty!!");
        }
        Object data = head.data;
        head=head.next;
        size--;
        return (T)data;
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
