package arrays;
import java.util.*;

public class Arr2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col value:");
		int row= sc.nextInt();
		int column=sc.nextInt();
		int arr1D[]= new int[row*column];
		int arr[][] = new int[row][column];
		System.out.println("enter values in col");
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		int index = 0;
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				//System.out.println(arr[i][j]);
				arr1D[index++]=arr[i][j];
			}
			
		}
		
		 System.out.println("Flattened 1D Array: " + Arrays.toString(arr1D));
		sc.close();
		
	}

}
