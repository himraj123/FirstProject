package com.udemy.dsbootcamp.test;

import com.udemy.dsbootcamp.main.LinkedList1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedList1Test {
    private LinkedList1 list;

    public static void main(String args[]){
        LinkedList1<Integer> list=new LinkedList1<Integer>();
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);

        System.out.println(list.getSize());
    }

    @Before
    public void SetUp() throws Exception{
        list = new LinkedList1<String>();
    }

    @Test
    public void AddFront() throws Exception{
        list.addFront("a");
        list.addFront("b");
        list.addFront("c");

        Assert.assertEquals("c",list.getFirst());
    }

    @Test
    public void AddBack() throws Exception{
        list.addBack("a");
        list.addBack("b");
        list.addBack("c");

        Assert.assertEquals("c",list.getLast());
    }

    @Test
    public void Delete() throws Exception{
        list.addBack("a");
        list.addBack("b");
        list.addBack("c");

        System.out.println(list.getSize());

        list.deleteValue("b");

        System.out.println(list.getSize());

        Assert.assertEquals("c",list.getLast());
    }

}
