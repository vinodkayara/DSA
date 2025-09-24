package com.queuelinkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    Node front, rear;
    int size;

    QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int ele) {
        Node newNode = new Node(ele);

        if (rear == null) {   // If queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(ele + " added to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;

        if (front == null) { // Queue becomes empty
            rear = null;
        }
        size--;
        return data;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Print queue
    public void print_queue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();

        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.print_queue();

        System.out.println("Dequeued: " + qll.dequeue());
        qll.print_queue();

        System.out.println("Peek: " + qll.peek());
    }
}
