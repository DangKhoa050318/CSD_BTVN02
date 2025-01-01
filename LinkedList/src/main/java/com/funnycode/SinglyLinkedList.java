package com.funnycode;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SinglyLinkedList {
    Node head; // 1 -> 2 -> 3

    public void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Tìm node cuoi cung
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // In ra link list
    public void printList() {
        Node t = head;
        while (t != null) {
                System.out.print(t.getData());
            t = t.next;
        }
    }

    // getNodeByIndex() => In ra 1 giá trị của Node đó tại ví trí index
    public void getNodeByIndex(int a) {
        Node t = head;
        int index = 0;
        while (t != null) {
            if (index == a) {
                System.out.println(t.getData());
                return;
            }
            ++index;
            t = t.next;
        }
    }

    public void addNode(int data, int index){
        Node n= new Node(data);
        if (head==null){
            head=n;
            return;
        }
        Node temp=head;
        Node prev=null;
        int count=0;
        while (temp.next!=null){
            if (count == index){
                break;
            }
            prev=temp;
            temp=temp.next;
            count++;
        }
        n.next=temp;
        prev.next=n;
    }
    public Node removeNode(int index){
        if(head == null){
            System.out.println("The list is empty");
            return null;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp.next != null){
            if(count == index){
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        return temp;
    }

    public Node removeFirst(){
        if(head == null){
            System.out.println("This list is empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }
    public Node removeLast(){
        if(head == null){
            System.out.println("This list is empty");
            return null;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }

    public static void main(String[] args) {
       /* SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(5);
        singlyLinkedList.getNodeByIndex(0);
        singlyLinkedList.getNodeByIndex(3);
        singlyLinkedList.addNode(4, 2);
        singlyLinkedList.printList();
        System.out.println("\nThe value of the last node: "+singlyLinkedList.removeLast().getData());
        singlyLinkedList.printList();
        System.out.println("\nThe value of the first node: "+singlyLinkedList.removeFirst().getData());
        singlyLinkedList.printList();
        System.out.println("\nThe node was removed at index 2 is "+singlyLinkedList.removeNode(2).getData());
        singlyLinkedList.printList();*/
        Stack stack = new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(9);
        stack.push(12);
        stack.printStack();
        System.out.println("\nThe node was removed: "+stack.pop().getData());
        stack.printStack();
        System.out.println("\n---------------------");
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.enqueue(12);
        queue.printQueue();
        System.out.println("\nThe Node was removed is: "+queue.dequeue().getData());
        queue.printQueue();
    }
}



