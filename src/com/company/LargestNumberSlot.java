package com.company;

import java.util.Random;

public class LargestNumberSlot {

        static int[] arr = new int[10];
        static Random rand = new Random();
        static int UPPERBOUND = 100;
        static int max = 0;
        static int slot = 0;

        public static void maxNumber(){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(UPPERBOUND);
                if (max < arr[i]){
                    max = arr[i];
                    slot = i;
                }

            }
            System.out.println("The largest number in the array is: " + max);
            System.out.println("It is in the slot " + slot);

        }

        public static void main(String[] args) {
            maxNumber();
        }
    }


