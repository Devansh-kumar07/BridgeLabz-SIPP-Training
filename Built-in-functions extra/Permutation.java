package METHODS;

import java.util.Scanner;

public class Permutation {
    public static int fact(int x){
        int x_fact = 1;
        for (int i = 1; i <= x; i++) {
            x_fact *= i;
        }
        return x_fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int npr = fact(n)/fact(n-r);
        System.out.println(npr);
    }

}
