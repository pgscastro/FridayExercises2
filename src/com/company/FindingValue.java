package com.company;

import java.util.Random;
import java.util.Scanner;

public class FindingValue {

        static int[] arr = new int[10];
        static Random rand = new Random();
        static int UPPERBOUND = 50;



        public static void finding() {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number to be found: ");
            int userInput = myObj.nextInt();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(UPPERBOUND);

                if (arr[i] == userInput){

                    System.out.println(userInput + " is in the Array list!");
                }

            }


        }

        public static void main(String[] args) {
            finding();
        }
    }



