package com.circularsinglylinkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Csll {
    Node head;

    // Print circular linked list
    public void print_ll() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head); // stop when we come back to head

        System.out.println();
    }

    // Add element at last
    public void add_last(int ele) {
        Node temp = new Node(ele);

        if (head == null) {
            head = temp;
            temp.next = head; // circular link
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
    }

    // Add element at first
    public void add_first(int ele) {
        Node temp = new Node(ele);

        if (head == null) {
            head = temp;
            temp.next = head;
        } else {
            Node curr = head;
            // go to last node
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp; // last node points to new node
            temp.next = head; // new node points to old head
            head = temp;      // update head
        }
    }
    
    public void delete_first() {
    	
    }
}

public class first {
    public static void main(String[] args) {
        Csll ll = new Csll();

        ll.add_last(10);
        ll.add_last(20);
        ll.add_last(30);
        ll.add_last(40);

        
        ll.print_ll();

        ll.add_first(5);
        ll.add_first(1);

       
        ll.print_ll();
    }
}
