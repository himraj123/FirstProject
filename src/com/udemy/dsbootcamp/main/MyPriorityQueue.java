package com.udemy.dsbootcamp.main;


import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Student> pq=new PriorityQueue<Student>();
        pq.add(new Student(30,"raj"));
        System.out.println(pq);
        pq.add(new Student(31,"ritu"));
        System.out.println(pq);
        pq.add(new Student(20,"monika"));
        System.out.println(pq);
        pq.add(new Student(1,"nyra"));
        System.out.println(pq);

        pq.remove();
        System.out.println(pq.size());

        System.out.println(pq);

        //PriorityQueue is an Abstract Data Type(ADT) that works on Heap DS, that use a
        // compareTo method of a class to decide priority. if items are equal, then the way it is placed
        // in an array of Heap, items will be displayed accordingly

    }
}

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // comparison based on age
    /*@Override
    public int compareTo(Student o) {
        if(this.age==o.age){
            return 0;
        }
        else if(this.age>o.age){
            return 1;
        }
        else{
            return -1;
        }
    }*/

    // comparison based on name
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString(){
        //return String.valueOf(this.age);
        return this.name;
    }
}
