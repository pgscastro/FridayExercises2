package com.company;

import java.util.Arrays;
import java.util.Random;

public class LocatingMaxNumber {
    static int[] arr = new int[10];
    static Random rand = new Random();
    static int UPPERBOUND = 100;
    static int max = 0;
    static int pos = 0;

    public static void maxNumber(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(UPPERBOUND);
            if (max < arr[i]){
                max = arr[i];
                pos = i;
            }

        }
        pos +=1;
        System.out.println("Array list: " + Arrays.toString(arr));
        System.out.println("The largest number in the array is: " + max);
        System.out.println("It is in the position: " + pos);

    }

    public static void main(String[] args) {
        maxNumber();
    }
}



