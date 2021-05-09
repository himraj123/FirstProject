package com.udemy.dsbootcamp.test;
import com.udemy.dsbootcamp.main.Queue;
import com.udemy.dsbootcamp.main.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackandQueueTest {
    private Stack stack;
    private Queue queue;

    @Before
    public void SetUp() throws Exception{
        stack = new Stack<Integer>();
        queue = new Queue<Integer>();
    }

    @Test
    public void PushandPopStack(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3,stack.pop());

    }

    @Test
    public void AddandRemoveQueue(){
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Assert.assertEquals(1,queue.remove());
    }
}
