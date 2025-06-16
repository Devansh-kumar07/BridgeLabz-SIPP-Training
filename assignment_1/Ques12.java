package assignment_1;

import java.util.Scanner;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter weight in pounds: ");
	        double pounds = scanner.nextDouble();
            scanner.close();
	        double kilograms = pounds * 2.2;

	        System.out.printf("The weight of the person in pounds "+  kilograms);

	}

}
