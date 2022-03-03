package com.company;
import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    static int[] arr = new int[10];
    static int[] arr2 = new int[10];
    static Random rand = new Random();
    static int UPPERBOUND = 100;

    public static void copying(){

        for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(UPPERBOUND);
        arr2[i] = arr[i];
    }
     arr[arr.length-1] = -7;
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));

    }
    public static void main(String[] args) {
        copying();
    }
}
