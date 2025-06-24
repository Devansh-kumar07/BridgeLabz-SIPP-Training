package day2;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Write the radious of circle:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		int area = (int) Math.PI*r*r;
		System.out.println("Area of circle is:"+area );
	}

}
