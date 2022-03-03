package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberPosition {
        static int[] arr = new int[10];
        static Random rand = new Random();
        static int UPPERBOUND = 50;
        static int found = 0;

        public static void slotPos(){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(UPPERBOUND);

            }
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Array list: " + Arrays.toString(arr));
            System.out.println("Enter number to be found: ");
            int userInput = myObj.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == userInput){
                    found = 1;
                    System.out.println(userInput + " is in the Array list in position: " + i);
                }

            }
            if (found == 0){
                System.out.println(userInput + " is not in the Array list");
            }


        }

        public static void main(String[] args) {
            slotPos();
        }
    }




