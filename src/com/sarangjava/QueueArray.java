package com.sarangjava;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        System.out.println(x);
        int z = x.compareTo(y);
        if (z == 0){
            System.out.println("Equal");
        }
        else if (z > 0){
            System.out.println(x + " is greater");
        }
        else{
            System.out.println(y + " is greater");
        }
    }
}