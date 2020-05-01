// Julian Saldana
// CECS 274-05
// Prog 3 – Linked List
// March 26 2020

package programs.LinkedList;

import java.util.Random;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] arg) {
        LinkedList L1 = new LinkedList();

        for (int i = 0; i < 100; i++)
            L1.add(randomWord());
        L1.display();
        boolean loop = true;
        while (loop) {
            System.out.printf("(A)dd, (D)elete, (F)ind, (Q)uit, List Size: %d\n", L1.size);
            Scanner in = new Scanner(System.in);
            switch (in.next().toUpperCase()) {
                case "A":
                    String newWord = randomWord();
                    L1.add(newWord);
                    L1.display();
                    System.out.printf("\n%s was added at location %d\n\n", newWord, L1.find(newWord));
                    break;
                case "D":
                    L1.display();
                    L1.delete();
                    break;
                case "F":
                    System.out.println("\nWhat word would you like to find?");
                    String userWord = in.next();
                    L1.display();
                    if (L1.find(userWord) != 0){
                        System.out.printf("\n%s was found at location %d\n\n", userWord, L1.find(userWord));
                    } else {
                        System.out.printf("\n%s not found\n\n", userWord);
                    }
                    break;
                case "Q":
                    System.out.println("\nThanks for using!");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }

    public static String randomWord(){
        Random rand = new Random();
        String word = "";
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        char letter;
        for (int i = 0; i < 4; i++){
            if (i != 1)
                letter = (char) (rand.nextInt(122 - 97 + 1) + 97);
            else
                letter = vowels[rand.nextInt(5)];
            word += letter;
        }
        return word;
    }
}
