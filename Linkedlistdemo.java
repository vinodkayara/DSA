package com.singlylinkedList;
public class Linkedlistdemo {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class LinkedList {
        private Node head;
        private int size;

        // Constructor
        public LinkedList() {
            head = null;
            size = 0;
        }

        // Add element at the beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // Add element at the end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        // Remove the first element
        public void removeFirst() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            head = head.next;
            size--;
        }

        // Remove the last element
        public void removeLast() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }

        // Check if list contains a value
        public boolean contains(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // Get the size of the list
        public int size() {
            return size;
        }

        // Clear the list
        public void clear() {
            head = null;
            size = 0;
        }

        // Print all elements in the list
        public void printList() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("List contains 20: " + list.contains(20));
        System.out.println("List size: " + list.size());

        list.removeFirst();
        System.out.println("After removing first:");
        list.printList();

        list.removeLast();
        System.out.println("After removing last:");
        list.printList();

        list.clear();
        System.out.println("After clearing the list:");
        list.printList();
    }
}
