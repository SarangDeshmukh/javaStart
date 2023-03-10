package com.sarangjava;

import java.util.Scanner;

public class LinkedList {
    Node head;

    public static LinkedList deleteByKey(LinkedList list, int key){
        Node currentNode = list.head, previousNode = null;
        if(currentNode != null && currentNode.data == key){
            list.head = currentNode.next;
            System.out.println(key + "found and deleted");
            return list;
        }

        while(currentNode != null && currentNode.data != key){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null){
            previousNode.next = currentNode.next;
            System.out.println(key+" found and deleted");
        }
        if (currentNode == null){
            System.out.println(key + " not found");
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("Linked List Elements: ");
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null){
            list.head = newNode;
        }else{
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to insert in Linked List: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int data = sc.nextInt();
            insert(list, data);
        }
        printList(list);
        System.out.println();
        System.out.println("Enter thr key you want to delete from linked list: ");
        int key = sc.nextInt();
        deleteByKey(list, key);
        printList(list);
    }
}
