package other;

import java.util.Scanner;

public class sum_recursion {
    public static void main(String[]arg){
        System.out.println("Enter a positive integer: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(sum(number));
    }

    public static int sum(int n){
        while (n >= 1){
            if (n == 1)
                return 1;
            else
                return n + sum(n - 1);
        }
        return 0;
    }
}