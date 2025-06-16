package assignment_1;

import java.util.Scanner;

public class Quse13 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of chocolates: ");
	        int numberOfChocolates = scanner.nextInt();

	        System.out.print("Enter the number of children: ");
	        int numberOfChildren = scanner.nextInt();
	        scanner.close();

	        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
	        int remainingChocolates = numberOfChocolates % numberOfChildren;

	        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild);
	        System.out.println("The number of remaining chocolates is " + remainingChocolates);
	}

}
