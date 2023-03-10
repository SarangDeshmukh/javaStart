package com.sarangjava;

public class Algorithm3 {
    static int count = 0;
    static int findNumber(int[] collection, int start, int end, int x){
        count++;
        if (end >= start){
            int mid = start + (end -start)/2;
            if (collection[mid] == x)
                return mid;
            if (collection[mid] > x)
                return findNumber(collection, start, mid -1, x);
            return findNumber(collection, mid+1, end, x);
        }
        return -1;
    }


    public static void main(String[] args) {
        Algorithm3 obj = new Algorithm3();
        int[] numCall = new int[1000000];
        for (int i = 0; i < numCall.length; i++){
            numCall[i] = i;
        }
        int high = numCall.length - 1;
        long startTime = System.currentTimeMillis();

        obj.findNumber(numCall, 0, high, 999987);

        System.out.println("We found values at " + count + " try");
        long endTime = System.currentTimeMillis();
        System.out.println("Time required : " + (endTime - startTime)+ "ms");
    }
}
