package com.funnycode;

public class Queue {
    Node n;
    public Queue(){
        this.n=null;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if (n==null){
            n=newNode;
            return;
        }
        Node temp=n;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public Node dequeue(){
        if (n==null){
            System.out.println("This queue is empty.");
            return null;
        }
        Node temp=n;
        n=n.next;
        return temp;
    }
    public void printQueue() {
        Node t = n;
        while (t != null) {
            System.out.print(t.getData()+" ");
            t = t.next;
        }
    }
}
