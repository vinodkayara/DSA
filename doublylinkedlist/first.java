package com.doublylinkedlist;

class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
		
		
	}
}
 class DLL{
	 
	 Node head;
	 Node tail;
	 
	public void print() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public void print_rev(Node tail) {
		Node curr=tail;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.prev;
		}
		System.out.println();
	}
	
	
	public void add_last(int ele) {
		Node temp =new Node(ele);
		if(tail==null) {
			head= temp;
			tail=temp;
			
		}else {
			temp.prev=tail;
			tail.next=temp;
			tail=temp;
		}
		
		
	}
	
	public void add_first(int ele) {
		Node temp = new Node(ele);
		if(tail==null)
		{
			head=temp;
			tail=temp;
		}
		else {
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	
}
	
	public void delete_first(int ele) {
		if(head==null) {
			System.out.println("ll is already empty");
			return;
		}
		if(head.next==null) {
			head=null;
			tail=null;
			
			
		}else {
			head=head.next;
			head.prev=null;
		}
	}
	
	public void delete_last(int index) {
	    if (head == null) {
	        System.out.println("ll is already empty");
	        return;
	    }
	    if (head.next == null) { // only one node
	        head = null;
	        tail = null;
	    } else {
	        tail = tail.prev;
	        tail.next = null;
	    }
	}

	public int size() {
		int count=0;
		Node curr =head;
		while(curr!=null) {
			curr=curr.next;
			count++;
			
		}
		return count;
	}
	public void add_at_index(int index,int ele) {
		if(index<0|| index>size()) {
			System.out.println("inv index");
			return;
		}
		if(index==0) {
			add_first(ele);
		}else if(index==size()) {
			add_last(ele);
		}
		else {
			Node temp= new Node(ele);
			Node curr=head;
			
			for(int i=0;i<index-1;i++) {
				curr=curr.next;
			}
			temp.next=curr.next;
			temp.prev=curr;
			curr.next.prev=temp;
			curr.next=temp;
			
		}
	}
	public void delete_at_index(int index) {
	    if (index < 0 || index >= size()) {
	        System.out.println("inv index");
	        return;
	    }

	    if (index == 0) {  
	        delete_first(index);   // reuse existing method
	    } else if (index == size() - 1) {  
	        delete_last(index);    // reuse existing method
	    } else {
	        Node curr = head;

	        // move curr to the node at 'index'
	        for (int i = 0; i < index; i++) {
	            curr = curr.next;
	        }

	        // unlink curr
	        curr.prev.next = curr.next;
	        curr.next.prev = curr.prev;

	        // help GC (optional)
	        curr.next = null;
	        curr.prev = null;
	    }
	}
	public int get_first() {
	    if (head == null) {
	        System.out.println("ll is empty");
	        return -1; // or throw exception
	    }
	    return head.data;
	}

	public int get_last() {
	    if (tail == null) {
	        System.out.println("ll is empty");
	        return -1; // or throw exception
	    }
	    return tail.data;
	}


}
public class first {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DLL d1=new DLL();
		d1.add_last(10);
		d1.add_last(20);
		d1.add_last(30);
		d1.add_last(40);
		d1.delete_first(10);
		d1.add_at_index(1, 60);
		d1.delete_at_index(1);
		d1.get_first();
		d1.get_last();
		
		d1.print();
		

	}

}
 