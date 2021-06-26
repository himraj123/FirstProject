package com.udemy.dsbootcamp.main;

class Tree{
    int data;
    Tree left,right;
    public Tree(int data){
        this.data = data;
        this.left=this.right=null;
    }
}

public class PrintLeftSideOfTree {
    int maxLevel = 0;
    public void printLeft(Tree root, int level){
        if(root == null) return;

        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }

        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
        //printLeft(root.left, level + 1);
    }


    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left= new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.right = new Tree(6);

        new PrintLeftSideOfTree().printLeft(tree,1);
    }
}
