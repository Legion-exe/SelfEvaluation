package codelab06;

public class SingleCard {

    private final typeCard typecard;
    private final numberCard numbercard;

    public SingleCard(typeCard typecard, numberCard numbercard) {
        this.typecard = typecard;
        this.numbercard = numbercard;


    }

    @Override
    public String toString() {
        return "SingleCard{" +
                "typecard=" + typecard +
                ", numbercard=" + numbercard +
                '}';
    }
}
