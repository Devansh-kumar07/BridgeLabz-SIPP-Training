
import java.util.Scanner;

public class Find_x_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        System.out.println("enter the element which you want to search ");
        int x = sc.nextInt();
        boolean flag = false;
        System.out.println("enter the element of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                flag = true; 
                break;
            }
        }
        if(flag == false){
            System.out.println("nhi milaa");
        }else{
            System.out.println("nhi milaa");
        }
    }
}
