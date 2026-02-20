package arrays;
import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter team size: ");
		int s = sc.nextInt();
		//int size[] = new int[s];
		int[] player = new int[s];
		int [] height = new int[s];
		
		System.out.println("enter the no of player and its height in cm one by one:");
		for(int i=0;i<s;i++) {
			player[i]=sc.nextInt();
			
			height[i]=sc.nextInt();
			System.out.println("the player num is :" +player[i]+ " its height is:"+ height[i]);
		}
		int hSum = 0;
		for(int i=0;i<s;i++) {
			hSum+=height[i]; 
		}
		double result = hSum/s;
		System.out.println(" the mean height of all the players is : " +result);
	}

}