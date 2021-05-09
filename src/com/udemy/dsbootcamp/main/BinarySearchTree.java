package com.udemy.dsbootcamp.main;

import org.junit.Before;

public class BinarySearchTree {
    class TNode{
        TNode left,right;
        int value;
        public TNode(int value,TNode left,TNode right){
            this.value=value;
            this.left=null;
            this.right=null;
        }

        public TNode min(){
            if(left==null)
            {
                return this;
            }
            else{
                return left.min();
            }
        }
    }

    public TNode findMin1(TNode node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }

    TNode root;

    public BinarySearchTree(){
        root=null;
    }

    public TNode findMin(TNode node){
        return node.min();
    }

    public void find(int data){
        find(root,data);
    }

    public void insert(int data){
        root = insert(root,data);
    }

    public void find(TNode node,int data){
        if(node==null){
            System.out.println("Node is not found");
            return;
        }
        if(data==node.value){
            System.out.println("Node is found");
            return;
        }
        if(data<node.value){
            find(node.left,data);
        }
        if(data>node.value){
            find(node.right,data);
        }
    }

    public TNode insert(TNode node,int data){
        if(node==null){
            node=new TNode(data,null,null);;
            return node;
        }
        if(data<node.value){
            node.left=insert(node.left,data);
        }
        if(data>node.value){
            node.right=insert(node.right,data);
        }
        return node;
    }

    public void delete(int data){
        root = delete(root,data);
    }

    public TNode delete(TNode node,int data){
        if(node==null){
            return null;
        }
        else if(data<node.value){
            node.left=delete(node.left,data);
        }
        else if(data>node.value){
            node.right=delete(node.right,data);
        }
        else{// node is found, following 3 cases for deletion is coded

            //No child case
            if(node.left==null && node.right==null){
                node=null;
            }
            // 1 child case (either left of right is not present
            else if(node.left==null){
                node=node.right;
            }
            else if(node.right==null){
                node=node.left;
            }
            // 2 children case
            else{
                TNode minNode=findMin1(node.right);
                node.value=minNode.value;
                node.right=delete(node.right,node.value);
            }
        }
        return node;
    }

    public void printTree(){
        printTree(root);
    }
    public void printTree(TNode root){
        if(root!=null){
            printTree(root.left);
            System.out.println(root.value);
            printTree(root.right);
        }
    }
}
