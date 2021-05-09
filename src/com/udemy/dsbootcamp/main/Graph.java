package com.udemy.dsbootcamp.main;

import sun.awt.image.ImageWatched;

import javax.xml.crypto.Data;
import java.util.*;

public class Graph {
    private static int V;
    LinkedList<Integer> adj[];


    public Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int s) {
        boolean visited[] = new boolean[V];
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("Starting at " + s);
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();

            Iterator<Integer> iterator = adj[s].iterator();

            while (iterator.hasNext()) {
                int v = iterator.next();
                if (!visited[v]) {
                    visited[v] = true;
                    System.out.println("Queueing " + v);
                    queue.add(v);
                }
            }
        }
    }

    public boolean pathExistBFS(int s, int e) throws InterruptedException {
        boolean visited[] = new boolean[V];
        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("Starting at " + s);
        long startTime = System.nanoTime();
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();

            Iterator<Integer> iterator = adj[s].iterator();

            while (iterator.hasNext()) {
                int v = iterator.next();
                if (v == e) {
                    System.out.println("Path is found till " + e);
                    Thread.sleep(1000);
                    long endTime = System.nanoTime();
                    System.out.println("Total time taken BFS: "+(endTime-startTime));
                    return true;
                } else if (!visited[v]) {
                    visited[v] = true;
                    System.out.println("Queueing " + v);
                    queue.add(v);
                }
            }
        }
        return false;
    }

    public boolean pathExistDFS(int s, int e) throws InterruptedException {
        boolean visited[] = new boolean[V];
        visited[s] = true;
        Stack<Integer> stack = new Stack<>();
        System.out.println("Starting at " + s);
        long startTime = System.nanoTime();
        stack.push(s);

        while (stack.size!=0) {
            s = stack.pop();

            Iterator<Integer> iterator = adj[s].iterator();

            while (iterator.hasNext()) {
                int v = iterator.next();
                if (v == e) {
                    System.out.println("Path is found till " + e);
                    Thread.sleep(1000);
                    long endTime = System.nanoTime();
                    System.out.println("Total time taken DFS: "+(endTime-startTime));
                    return true;
                } else if (!visited[v]) {
                    visited[v] = true;
                    System.out.println("Queueing " + v);
                    stack.push(v);
                }
            }
        }
        return false;
    }

    public void DFS(int s){
        boolean visited[] = new boolean[V];
        visited[s] = true;
        Stack<Integer> stack = new Stack<>();
        System.out.println("Starting at " + s);
        Date date = new Date();
        long startTime = date.getTime();
        stack.push(s);

        while (stack.size!=0) {
            s = stack.pop();

            Iterator<Integer> iterator = adj[s].iterator();

            while (iterator.hasNext()) {
                int v = iterator.next();
                if (!visited[v]) {
                    visited[v] = true;
                    System.out.println("Queueing " + v);
                    stack.push(v);
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Total time taken: "+(endTime-startTime)/1000000);
    }
}
