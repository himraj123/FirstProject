package com.udemy.dsbootcamp.test;

import com.udemy.dsbootcamp.main.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    private BinarySearchTree bst;

    @Before
    public void SetUp() throws Exception{
        bst = new BinarySearchTree();
    }

    @Test
    public void Insert() throws Exception{
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);

        bst.printTree();
    }

    @Test
    public void MinKey() throws Exception{

    }

    @Test
    public void DeleteNoChild() throws Exception{

    }

    @Test
    public void DeleteOneChild() throws Exception{
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);

        bst.delete(6);
        bst.printTree();
    }

    @Test
    public void DeleteTwoChildrn() throws Exception{
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(7);

        bst.delete(4);
        bst.printTree();
    }
}
