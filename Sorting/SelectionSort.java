package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {70, 50, 90, 60};

        for (int i = 0; i < scores.length - 1; i++) {
            // Find index of minimum element in the remaining unsorted part
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            

            // Swap the found minimum with the first unsorted element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Sorted scores: " + Arrays.toString(scores));
    }
}

