
import java.util.Scanner;

public class Count_element_greater_than_x {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,8,6,7,8,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
            
        }
        System.out.println("count of element greator than x"+count);
    }

}
