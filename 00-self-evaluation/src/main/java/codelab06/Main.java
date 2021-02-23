package codelab06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SingleCard card1 = new SingleCard(typeCard.DIAMONDS, numberCard.ACE);
        SingleCard card2 = new SingleCard(typeCard.SPADES, numberCard.ACE);

        SingleCard[] groupCards = {card1, card2};

        Deck deck = new Deck(Deck.getFullCardDeck());
        System.out.println(Arrays.toString(Deck.getFullCardDeck()));
    }
}
