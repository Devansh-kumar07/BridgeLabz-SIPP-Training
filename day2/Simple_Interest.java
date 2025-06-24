package day2;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		System.out.println("enter principal:");
		Scanner sc = new Scanner(System.in);
		float p = sc.nextInt();
		System.out.println("enter time in years:");
		int t= sc.nextInt();
		System.out.println("enter rate");
		int r= sc.nextInt();
		sc.close();
		double S_I= (p*r*t)/100;
		System.out.println("your S.I is :"+ S_I);
	
	}

}
