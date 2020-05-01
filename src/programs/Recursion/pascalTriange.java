package programs.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriange {
    public static void main(String[]arg) {
        ArrayList<Integer> hp = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int rowMax = in.nextInt();

        // adding to an array list based on how many rows i want
        for (int row = 0; row < rowMax; row++) {
            for (int col = 1; col <= row; col++)
                hp.add(pascal(row, col));   // still need to add to array list
//            display(hp);    // need to create display function
        }

        int user_height = 5;
        for (int i = 1; i < user_height; i++) {
            for (int k = 0; k < user_height - i; k++)
                System.out.print("    ");
            for (int j = 1; j <= i; j++)
                System.out.printf("%8d", pascal(i, j));
            System.out.println();
        }
    }

    public static int pascal(int r, int c){
        if (r == c || c == 1)
            return 1;
        else
            return pascal(r-1,c-1) + pascal(r-1, c);
    }
}


