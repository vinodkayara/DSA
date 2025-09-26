package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder1 {
	 public static void level_order(Node root) {
	    	Queue<Node> q=new LinkedList<>();
	    	q.add(root);
	    	while(!q.isEmpty()) {
	    		
	    		int size=q.size();
	    		for(int i=1;i<=size;i++) {
	    			Node curr=q.poll();
		    		System.out.print(curr.data+" ");
		    		if(curr.left!=null) {
		    		   q.add(curr.left);
		    		   
		    		}
		    		if(curr.right!= null) {
		    			q.add(curr.right);
		    		}
	    		}
	    		System.out.println();
	    		}
	    		
	    	}
	 
 public static void main(String args[]) {
	 Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.left.right.left = new Node(6);
     root.left.left.right= new Node(7);
     
     System.out.println("Level-order Traversal:");
     level_order(root);
     System.out.println();
     
 }

}
