package programs.SolitairePrime;

import java.util.Random;

public class Deck {
    private Card [] storage;        // makes an array of cards
    private int top;        // top of the deck, the next card to deal

    public Deck(){
        char [] suits = {'H', 'D', 'S', 'C'};
        char [] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        storage = new Card[52]; // doesn't create the cards, but rather the references; saves spots in the memory
        top = 0;    // the top card in the deck

        int count = 0;
        Card C1;
        for (int s = 0; s < suits.length; s++){
            for (int r = 0; r < ranks.length; r++){
                C1 = new Card(ranks[r], suits[s]);
                storage[count++] = C1;
            }
        }
    }

    public void display() {
        for (int i = 0; i < storage.length; i++) {
            if (i % 13 == 0)
                System.out.println('\n');
            storage[i].display();
        }
    }

    public void shuffle(){
        Random rand = new Random();
        Card temp;
        for (int i = 0; i < 52; i++){
            int new_card = rand.nextInt(52);
            temp = storage[i];
            storage[i] = storage[new_card];
            storage[new_card] = temp;
        }
    }

    public Card deal(){
//        int top_card = top;
//        top++;
//        return storage[top_card];
        return storage[top++];
    }

    public int cardsLeft(){
        return 52 - top;
    }
}
