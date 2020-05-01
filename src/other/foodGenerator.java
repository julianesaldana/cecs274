package other;

import java.util.Random;
import java.util.Scanner;

public class foodGenerator {
    public static void main(String[]arg){
        System.out.println("What foods would you like to eat today?");
        Scanner in = new Scanner(System.in);
        String [] foods = new String[10];
        for (int i = 0; i < 4; i++){
            System.out.printf("option %d? ", (i + 1));
            String options = in.nextLine();
            foods[i] = options;
        }
        Random rand = new Random();
        int choice = rand.nextInt(4);
        System.out.printf("The food today is: %s", foods[choice]);
    }
}
