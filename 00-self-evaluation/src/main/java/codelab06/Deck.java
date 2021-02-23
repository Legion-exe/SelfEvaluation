package codelab06;

public class Deck {

    private SingleCard[] allCards;

    public Deck(SingleCard[] allCards) {
        this.allCards = allCards;
    }

    public Deck() {
        this(getFullCardDeck());
    }

    static SingleCard[] getFullCardDeck() {
        SingleCard[] result = new SingleCard[52];
        int i = 0;
        for (numberCard cardX : numberCard.values()) {
            for (typeCard cardType : typeCard.values()) {

                SingleCard cardExtra = new SingleCard(cardType, cardX);
                result[i] = cardExtra;
                ++i;
            }

        }


        return result;
    }


}
