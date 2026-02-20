package day2;

import java.util.Scanner;

public class CelToFer {
	public static void main(String[] args) {
		System.out.println("Enter the temp in celcious");
		Scanner sc = new Scanner(System.in);
		int cel=sc.nextInt();
		sc.close();
		int Fahrenheit = (cel * 9/5) + 32;
		System.out.println("temp in fahrenheit is :" + Fahrenheit);
	}

}
