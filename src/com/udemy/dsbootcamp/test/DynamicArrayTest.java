package com.udemy.dsbootcamp.test;

import com.udemy.dsbootcamp.main.DynamicArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DynamicArrayTest {
    private DynamicArray array;

    @Before
    public void setUp() throws Exception{
        array= new DynamicArray<String>(3);
    }

    @Test
    public void GetAndSet() throws Exception{
        System.out.println(array.getCapacity());
        array.set(0,"a");
        System.out.println(array.getSize());
        Assert.assertEquals("a",array.get(0));
        array.set(1,"b");
        Assert.assertEquals("b",array.get(1));
        array.set(2,"c");
        Assert.assertEquals("c",array.get(2));
        array.insert(1,"d");
        array.set(3,"e");
        Assert.assertEquals("e",array.get(3));
    }

    @Test
    public void Insert() throws Exception{
        array.add("a");
        array.add("b");
        array.add("c");

        array.insert(1,"d");

        System.out.println(array.getCapacity());
        Assert.assertEquals(4,array.getSize());

        array.insert(1,"e");
        System.out.println(array.getCapacity());
    }

    @Test
    public void Delete() throws Exception{
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        System.out.println(array.getCapacity());

        array.delete(1);//b
        array.delete(1);//c
        array.delete(1);//d
        array.delete(1);//e

        System.out.println(array.getCapacity());
        Assert.assertEquals(1,array.getSize());
        Assert.assertEquals("a",array.get(0));
        //Assert.assertEquals("Array index out of bound",array.get(1));
    }

}
