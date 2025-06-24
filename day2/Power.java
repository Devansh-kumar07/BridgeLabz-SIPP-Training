package day2;
import java.util.Scanner;

//public class Expo{
//static int pow(int e) {
//	int res = e-1;
//	return res;
//}
//}

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base value :");
		int b=sc.nextInt();
		System.out.println("enter the exponent value:");
		int e=sc.nextInt();
		sc.close();
		int power=pow(b,e);
		System.out.println("your final result is "+ power);
	}

	private static int pow(int b,int e) {
		// TODO Auto-generated method stub
		int res=1;
		for(int i=0;i<e;i++) {
		 res*=b;
		}
		return res;
	}

}
