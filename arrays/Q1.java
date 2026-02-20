package arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		System.out.println("enter all 10 student ages:");
		for(int i=0;i<10;i++) {
			age[i]=sc.nextInt();
			
			
		}
		sc.close();
		for(int i=0;i<10;i++) {
			if(age[i]>=18) {
				System.out.println("child can vote as he is :"+age[i]);
			}
			System.out.println("child cant vote");
		}
		
	}

}
