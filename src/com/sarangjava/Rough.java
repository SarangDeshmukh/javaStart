package com.sarangjava;

import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("Type a value between 0 and 20");
            a = sc.nextInt();
        }while (a<0 || a>20);
        System.out.println(a+17);
    }
}
