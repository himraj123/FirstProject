package com.udemy.dsbootcamp.test;

import com.udemy.dsbootcamp.main.Graph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {
    Graph g;

    @Before
    public void setUp(){
        g= new Graph(8);
    }

    @Test
    public void Search() throws InterruptedException {
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(1,4);
        g.addEdge(4,1);
        g.addEdge(4,6);
        g.addEdge(6,4);
        g.addEdge(6,0);
        g.addEdge(0,6);
        g.addEdge(1,5);
        g.addEdge(5,1);
        g.addEdge(5,3);
        g.addEdge(3,5);
        g.addEdge(3,0);
        g.addEdge(0,3);
        g.addEdge(5,2);
        g.addEdge(2,5);
        g.addEdge(2,7);
        g.addEdge(7,2);

        //g.BFS(0);
        Assert.assertTrue(g.pathExistBFS(0,4));
        Assert.assertTrue(g.pathExistDFS(0,4));
        //g.DFS(1);
    }
}
