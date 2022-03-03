package com.company;
import java.util.Random;
import java.util.Scanner;


public class WhereIsIt {

        static int[] arr = new int[10];
        static Random rand = new Random();
        static int UPPERBOUND = 100;



        public static void copying() {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number to be found: ");
            int userInput = myObj.nextInt();

            int pos = 0;



            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(UPPERBOUND);

                if (arr[i] == userInput){
                    pos = 1;
                    System.out.println(userInput + " is in position " + i);
                }

            }
            if (pos == 0){
                System.out.println(userInput + " is not in the array!");
            }


        }

    public static void main(String[] args) {
        copying();
    }
}
