package com.company;
import java.util.Arrays;
import java.util.Random;

public class DisplayArrays {
    static int[] arr = new int[10];
    static Random rand = new Random();
    static int upperbound = 100;

    public static void arrayGen() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperbound);
        }

        System.out.println("Array list: " + Arrays.toString(arr));
    }


    public static void main(String[] args) {
        arrayGen();
    }
}
