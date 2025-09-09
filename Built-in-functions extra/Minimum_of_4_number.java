package METHODS;

import java.util.Scanner;

// build in Function

public class Minimum_of_4_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int d = sc.nextInt();
         System.out.println(Math.min(a,Math.min(b,Math.min(c, d))));
    }
}
