package day1;
import java.util.*;

public class ques7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a,b and c");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		sc.close();
		double res1= a + b *c;
		double res2=a % b + c;
		double res3= a * b + c;
		double res4=c + a / b;
		System.out.println("your res1 :"+res1+" "+"your res2:"+res2+" "+"your res3:"+res3+" "+res4+"your res4:");
	}

}
