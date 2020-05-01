//Julian Saldana
//CECS 274-05
//Prog 4 - Human Pyramid
//April 21, 2020

package programs.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class humanPyramid {
    public static void main(String[] arg) {
        String option = "y";
        Scanner in = new Scanner(System.in);
        while (option.equals("y")) {
            ArrayList<Integer> hp = new ArrayList<Integer>();

            System.out.println("How tall is your pyramid?");
            int user_height = in.nextInt();

            for (int row = 1; row <= user_height; row++) {  // creating array list of people based on user_height
                for (int col = 1; col <= row; col++)    // limits columns to number of rows
                    hp.add((int) (pascal(row, col))); // casting results as int before adding to array list
            }

            display(hp, user_height); // displays pyramid

            System.out.println("Would you like to try again?");
            option = in.next().toLowerCase();
        }
    }

    public static double pascal(int r, int c){
        if (r == 1 && c == 1) // base case for top of the pyramid
            return 0;
        else if (c == 1) // left side of pyramid
            return 75 + (pascal(r-1, c) / 2); // for people on the far left plus the 1 person on his right shoulder
        else if (r == c)    // right side of pyramid
            return 75 + (pascal(r-1,c-1) / 2);  // for people on the far right plus the 1 person on his left shoulder
        else    // general case, for people in the middle carrying one person on each shoulder
            return 150 + (pascal(r-1,c-1) / 2) + (pascal(r-1, c) / 2);
    }

    public static void display(ArrayList<Integer> list, int height) {
        int index = 0; // keeping track of array list index
        for(int i = 1; i <= height; i++){   // displays the amount of rows user provides
            for(int j = 0; j < (height - i) ; j++) // for spacing on the left side
                System.out.print("   ");    // empty space
            for(int j = 0; j < i; j++)
                System.out.printf("(%4d)", list.get(index++)); // print format for pyramid inside spacing with parenthesis
            System.out.println(); // starts new row onto next line
        }
        System.out.println();
    }
}