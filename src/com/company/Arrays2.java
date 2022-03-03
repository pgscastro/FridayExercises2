package com.company;

import java.util.Random;

public class Arrays2 {
    static int[] arr = new int[10];
    static Random rand = new Random();
    static int upperbound = 100;

    public static void arrays() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperbound);
            System.out.println("slot " + i + " contains " + arr[i]);

        }


    }

    public static void main(String[] args) {
        arrays();
    }




}
