package com.sarangjava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public int search(int[] array, int value){
        int location = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                location = i;
                break;
            }
        }
        return location;
    }

    public int[] deleteElement(int[] array, int position){
        int location = search(array, position);
        if(location >= 0){
            for (int i = location + 1; i < array.length; i++){
                array[i - 1] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length-1);
    }

    public int[] addElement(int[] array, int position, int value) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        result[position] = value;
        for (int i = position+1; i < result.length; i++){
            result[i] = array[i-1];
        }
        return result;
    }

    public void printAllElement(String msg, int[] arr){
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in an Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the Elements of the Array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Array array = new Array();

        // Adding new Element;
        System.out.println("Enter the position to add value : ");
        int position = sc.nextInt();
        System.out.println("Enter the value you want to add : ");
        int value = sc.nextInt();
        array.printAllElement("All element before adding :: ", arr);
        arr = array.addElement(arr, position, value);
        array.printAllElement("All Element after adding a number :: ", arr);
        System.out.println("------------------------------------------------------------");

        //Delete the element in an array
        System.out.println("Enter the number you want to delete : ");
        position = sc.nextInt();
        arr = array.deleteElement(arr, position);
        array.printAllElement("All element after delete :: ", arr);
    }
}
