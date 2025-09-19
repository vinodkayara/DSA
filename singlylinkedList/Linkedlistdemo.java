package com.singlylinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	public void print_ll() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;

		}
		System.out.println();

	}

	public void add_last(int ele) {
		Node temp = new Node(ele);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}

			curr.next = temp;

		}
	}


public void add_first(int ele) {
	Node temp = new Node(ele);
	if (head == null) {
		head = temp;
	}
	else {
		Node curr=head;
		head=temp;
		temp.next=curr;
//		or
		
//		temp.next=head;
//		head=temp;
		
		
		
	}
}

public void delete_first() {

	if(head==null) {
		System.out.println("deletion not posible");
		return;
	}
	
	if(head.next==null) {
		head=null;
	}
	else {

     head=head.next;
	}
}


public void delete_last() {
	if(head==null) {
		System.out.println("deletion not posible");
		return;
	}
	if(head.next==null) {
		head=null;
	}
	else {
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
	}
	
}
public int size() {
	Node curr = head;
	int count=0;
while (curr != null) {
//	System.out.println(curr.data);
	count++;
	curr = curr.next;

}
	return count;
}

public void add_At_Index(int ind, int ele) {
	if(ind<0 || ind>size()) {
		System.out.println("not possible");
		return;
	}
	if(ind==0) {
		add_first(ele);
	}
	else if(ind==size()) {
		add_last(ele);
	}
	else {
		Node curr=head;
		Node temp=new Node(ele);
		for(int i=0;i<ind-1;i++) {
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
	}
	
}

public void delete_At_Index(int ind) {
	if(ind<0 || ind>=size()) {
		System.out.println("not possible");
		return;
	}
	if(ind==0) {
		delete_first();
	}
	else if(ind==size()-1) {
		delete_last();
		
		
	}
	else {
		Node cur=head;
		for(int i=0;i<ind-1;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
	}
}
public void get_first() {
	if(head==null) {
		System.out.println("empty");
		return;
	}
	System.out.println(head.data);
	
	
}
public void get_last() {
	if(head==null) {
		System.out.println("empty");
		return;
	}
	Node curr=head;
	while(curr.next!=null) {
		curr=curr.next;
	}
	System.out.println(curr.data);
	
	
}
public void get_At_index(int ind) {
	if(ind<0 || ind>=size()) {
		System.out.println("not possible");
		return;
	}
	if(ind==0) {
		get_first();
	}
	else if(ind==size()-1) {
		get_last();
		
		   
	}
	else {
		Node curr=head;
		for(int i=0;i<ind;i++) {
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
}


}

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add_last(10);
		ll.add_last(20);
		ll.add_last(30);
		ll.add_last(40);
		ll.add_first(5);
//		ll.add_first(2);
//		ll.delete_first();
//		ll.delete_last();
////		ll.print_ll();
//		ll.add_At_Index(2,50);
//		ll.delete_At_Index(1);
		ll.get_first();
		ll.get_last();
		ll.get_At_index(1);
		
		ll.print_ll();

	}

}