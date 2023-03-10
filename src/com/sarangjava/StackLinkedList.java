package com.sarangjava;

public class StackLinkedList {
    public static Node first = null;
    static StackLinkedList list = new StackLinkedList();

    public static void push(int data){
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public static void pop(){
        Node temp = first;
        first = first.next;
        System.out.println("Removed Element Elements " + temp.data);
    }

    public static void printList(StackLinkedList list){
        Node currentNode = list.first;
        System.out.println("The Linked Elements are: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        list.push(1);
        list.push(2);
        list.push(3);
        printList(list);
        list.pop();
        printList(list);
    }
}
