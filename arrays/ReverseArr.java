package arrays;
import java.util.*;

public class ReverseArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of your array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements of your array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" array before reversing:");
		for(int i=0;i<size;i++) {
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(" array after reversing:");
//		for(int i=size-1;i>=0;i--) {
//			//System.out.println(arr[i]);
//			int temp = arr[i];
//			arr[]
//		}
		for(int i = 0; i < size / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[size - 1 - i];
			arr[size - 1 - i] = temp;
		}
		System.out.println("array after reversing:" + Arrays.toString(arr));
		sc.close();
	}

}
