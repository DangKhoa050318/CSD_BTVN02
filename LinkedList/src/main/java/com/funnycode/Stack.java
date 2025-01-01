package com.funnycode;

public class Stack {
    Node n;
    public Stack(){
        this.n=null;
    }
    public void push(int data){
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
    public Node pop(){
        if (n==null){
            System.out.println("This stack is empty");
            return null;
        }
        Node temp=n;
        Node prev=null;
        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next =null;
        return temp;
    }
    public void printStack() {
        Node t = n;
        while (t != null) {
            System.out.print(t.getData()+" ");
            t = t.next;
        }
    }
}
