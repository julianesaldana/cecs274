package programs.Recursion;

import java.util.Scanner;

public class quiz4 {
    public static void main(String[]arg){
        System.out.println(tribonacci(12));
    }

    public static int tribonacci(int n){
        if (n == 0 || n == 1 || n == 2 || n == 3)
            return 1;
        else
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n - 3);
    }
}

