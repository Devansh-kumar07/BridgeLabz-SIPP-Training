import java.util.Scanner;
public class Taking_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Taking input from user and storing in array
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing the array elements
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}