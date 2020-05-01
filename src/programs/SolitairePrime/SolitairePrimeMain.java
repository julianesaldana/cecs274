// Julian Saldana
// CECS 274-05
// Prog 2 – Solitaire Prime
// March 3 2020

package programs.SolitairePrime;

import java.util.Scanner;

public class SolitairePrimeMain {
    public static void main(String[] arg) {
        System.out.println("Welcome to Solitaire Prime!");
        Deck myDeck = new Deck();
        boolean loop = true;
        while (loop){
            switch (menu()) {
                case 1:
                    myDeck = new Deck();
                    break;
                case 2:
                    myDeck.display();
                    break;
                case 3:
                    myDeck.shuffle();
                    break;
                case 4:
                    System.out.println("Playing Solitaire Prime!");
                    myDeck = new Deck();
                    myDeck.shuffle();
                    playSolitaire(myDeck);
                    break;
                case 5:
                    System.out.println("Thanks for using!");
                    loop = false;
                    break;
                case 6:
                    int win = 0;
                    int lose = 0;
                    for (int i = 0; i < 1000; i++) {
                        myDeck = new Deck();
                        myDeck.shuffle();
                        if (playSolitaire(myDeck))
                            win++;
                        else
                            lose++;
                    }
                    System.out.printf("\nIn 1000 games, you won %d and lost %d", win, lose);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }

    public static int menu(){
        System.out.println("\n1) New Deck\n2) Display Deck\n3) Shuffle deck\n" +
                "4) Play Solitaire Prime\n5) Exit\n6) Simulate 1000 games");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static boolean playSolitaire(Deck d) {
        int pile = 0;
        int pileCtr = 0;
        for (int i = 0; i < 52; i++) {
            Card tempCard = d.deal();
            tempCard.display();
            pile += tempCard.getValue();
            System.out.print(", ");
            if (isPrime(pile)){
                System.out.printf("Prime: %d\n", pile);
                pile = 0;
                pileCtr++;
            }
        }
        if ((d.cardsLeft() == 0) && (pile == 0)) {
            System.out.printf("Winner in %d piles!\n", pileCtr);
            return true;
        } else
            System.out.println("Loser");
        return false;
    }


    public static boolean isPrime(int x) {
        if (x == 1)
            return false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
