package com.udemy.dsbootcamp.test;

import com.udemy.dsbootcamp.main.HashTable;
import com.udemy.dsbootcamp.main.HashTableVariant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {
    private HashTableVariant<Integer,String> map;
    //private HashTable<Integer,String> map;

    @Before
    public void SetUp() throws Exception{
        map = new HashTableVariant<Integer,String>();
        //map = new HashTable<Integer,String>();
    }

    @Test
    public void MapPut() throws Exception{
        map.put(1,"a");
        map.put(3,"b");
        map.put(18,"c");
        System.out.println(map.getIndex(3));
        System.out.println(map.getIndex(18));

        System.out.println(map.get(19));
        System.out.println(map.get(18));
    }
}
