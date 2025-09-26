package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    
    public static void pre_order(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        pre_order(root.left);
        pre_order(root.right);
    }

    public static void in_order(Node root) {
        if (root == null) {
            return;
        }
        in_order(root.left);
        System.out.print(root.data + " ");
        in_order(root.right);
    }

    public static void post_order(Node root) {
        if (root == null) {
            return;
        }
        post_order(root.left);
        post_order(root.right);
        System.out.print(root.data + " ");
    }
    public static void level_order(Node root) {
    	Queue<Node> q=new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		Node curr=q.poll();
    		System.out.print(curr.data+" ");
    		if(curr.left!=null) {
    		   q.add(curr.left);
    		   
    		}
    		if(curr.right!= null) {
    			q.add(curr.right);
    		}
    	}
    	
    }

    public static void main(String[] args) {
        // Creating a binary tree manually
        /*
                  1
                 / \
                2   3
               / \   \
              4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.left.right= new Node(7);

        System.out.println("Pre-order Traversal:");
        pre_order(root);
        System.out.println();

        System.out.println("In-order Traversal:");
        in_order(root);
        System.out.println();

        System.out.println("Post-order Traversal:");
        post_order(root);
        System.out.println();
        
        System.out.println("Level-order Traversal:");
        level_order(root);
        System.out.println();
    }
}
