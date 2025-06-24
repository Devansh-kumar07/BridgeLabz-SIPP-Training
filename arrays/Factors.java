package arrays;
import java.util.*;


public class Factors {
    public static void main(String[] args) {
        // 1. Take input for a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // 2. Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // 3. Loop through numbers from 1 to number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // 4. If array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;  // double the size
                    int[] temp = new int[maxFactor];

                    // Copy elements from old to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Replace old array with new one
                    factors = temp;
                }

                // Store the factor and increment index
                factors[index++] = i;
            }
        }

        // 5. Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
