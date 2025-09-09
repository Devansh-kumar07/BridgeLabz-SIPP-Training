package METHODS;

import java.util.Scanner;

public class Greatest_of_3_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        System.out.println(Math.max(m,Math.max(n, o)));
    }
}
