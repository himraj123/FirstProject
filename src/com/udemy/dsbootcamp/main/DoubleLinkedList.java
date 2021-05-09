package com.udemy.dsbootcamp.main;

public class DoubleLinkedList<T> {
    int size;
    private static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;
        public Node(T data){
            this.data=data;
        }
    }

    Node<T> head;

    public void addFront(T data){
        Node<T> newNode = new Node<T>(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }

    public void addBack(T data){
        Node<T> newNode = new Node<T>(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        Node<T> current = head;
        while(current.next!=null){
            current=current.next;
        }

        current.next=newNode;
        newNode.prev=current;
        size++;
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
            Node<T> current = head;
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

    public void deleteValue(T data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head=head.next;

        }
        else{
            Node<T> current = head;
            while(current.next!=null){
                if(current.next.data==data){
                    current.next=current.next.next;
                    current.next.next.prev=current;
                    break;
                }
                current=current.next;
            }
        }
        size--;
    }
}
