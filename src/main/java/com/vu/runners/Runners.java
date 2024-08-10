/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.runners;

/**
 *
 * @author HP
 */
public class Runners {



    public static void main(String[] args) {
        // Names of the runners
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        // Corresponding times in minutes
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // Variables to store the indices of the fastest and second fastest runners
        int fastestIndex = 0;
        int secondFastestIndex = 0;

        // Find the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                fastestIndex = i;
            }
        }

        // Initialize secondFastestIndex to the first valid index that is not the fastestIndex
        secondFastestIndex = (fastestIndex == 0) ? 1 : 0;

        // Find the second fastest runner
        for (int i = 0; i < times.length; i++) {
            if (i != fastestIndex && times[i] < times[secondFastestIndex]) {
                secondFastestIndex = i;
            }
        }

        // Print the results
        System.out.println("Fastest Runner: " + names[fastestIndex] + " with a time of " + times[fastestIndex] + " minutes");
        System.out.println("Second Fastest Runner: " + names[secondFastestIndex] + " with a time of " + times[secondFastestIndex] + " minutes");
    }
}


    
