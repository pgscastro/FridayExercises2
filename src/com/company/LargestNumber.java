package com.company;

import java.util.Random;

public class LargestNumber {
    static int[] arr = new int[10];
    static Random rand = new Random();
    static int UPPERBOUND = 100;
    static int max = 0;

    public static void maxNumber(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(UPPERBOUND);
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println("The largest number in the array is: " + max);

    }

    public static void main(String[] args) {
        maxNumber();
    }
}
