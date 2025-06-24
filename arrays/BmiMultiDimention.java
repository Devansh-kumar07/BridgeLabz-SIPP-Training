package arrays;
import java.util.Scanner;

public class BmiMultiDimention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];    // weight status

        // Step 2 & 3: Input weight, height with validation, calculate BMI & status
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight (positive only)
            double weight;
            do {
                System.out.print("Enter weight in kg (positive): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive.");
                }
            } while (weight <= 0);

            // Input height (positive only)
            double height;
            do {
                System.out.print("Enter height in meters (positive): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Step 4: Display all data in a formatted table
        System.out.println("--- BMI Report ---");
        System.out.printf( "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        // Step 5: Reference BMI Table (for explanation)
        System.out.println("\n--- BMI Weight Status Reference ---");
        System.out.println("Below 18.5      : Underweight");
        System.out.println("18.5 to 24.9    : Normal");
        System.out.println("25 to 29.9      : Overweight");
        System.out.println("30 and above    : Obese");

        sc.close();
    }
}
