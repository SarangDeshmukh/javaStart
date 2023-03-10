package com.sarangjava;

public class DoublyLinkedList {
    class Node{
        String data;
        Node prev;
        Node next;

        public Node(String data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNewNode(String data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;

            head.prev = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void showData(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
        }

        System.out.println("Nodes Of Doubly Linked List: ");

        while(current != null){
            System.out.println(current.data+"\n");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.addNewNode("Maharashtra");
        obj.addNewNode("Madhya Pradesh");
        obj.addNewNode("Delhi");

        obj.showData();
    }
}
