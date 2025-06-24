package arrays;
import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:"+" ");
		int number = sc.nextInt();
		sc.close();
		
		if(number<1) {
			System.out.println("entry is wrong , please fill a natural number :");	
		}
		int size = number/2 +1;
		int[] evenArr=new int[size];
		int[] oddArr=new int[size];
		
		int evenIndex = 0;//day1 prog ele,day2 control flow , day3 array,day4 mthod , day 5 string.
		int oddIndex=0;
		
		for(int i =1;i<number;i++) {
			if(i%2==0) {
				evenArr[evenIndex++]=i;
			}
			oddArr[oddIndex++]=i;
		}
		for(int i = 0; i<=evenIndex;i++) {
			System.out.println("the even numbers are :"+i);
		}
		for(int i = 0; i<=oddIndex;i++) {
			System.out.println("the odd numbers are :"+i);
		
	}

}
}
