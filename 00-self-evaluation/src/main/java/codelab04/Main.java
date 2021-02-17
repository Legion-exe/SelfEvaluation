package codelab04;

/**
 * Read the README.md for the assignment
 */
public class Main {

    public static void main(String[] args) {

        //Enter here number of the wanted month
        month(7);
        //Number of bought items
        calculatePrice(8);
        //INT between 1 and 3 included
        returnText(3);
    }

    public static String month(int i) {
        String printedMonth;
        switch (i) {
            case 1:
                printedMonth="January";
                break;
            case 2:
                printedMonth="February";
                break;
            case 3:
                printedMonth="March";
                break;
            case 4:
                printedMonth="April";
                break;
            case 5:
                printedMonth="May";
                break;
            case 6:
                printedMonth="June";
                break;
            case 7:
                printedMonth="July";
                break;
            case 8:
                printedMonth="August";
                break;
            case 9:
                printedMonth="September";
                break;
            case 10:
                printedMonth="October";
                break;
            case 11:
                printedMonth="November";
                break;
            case 12:
                printedMonth="December";
                break;
            default:
                printedMonth="between 1 and 12, thanks!";
                break;
        }
        return printedMonth;
    }


    public static double calculatePrice(int amountOfElements) {
        double priceToPay = 0;
        if (amountOfElements <= 0) {
            System.out.println("Nothing to pay, you didn't buy anything...");
        } else if (amountOfElements > 15) {
            priceToPay = 50 + 20 + (amountOfElements-15) * 3;
            System.out.println("Price is " + priceToPay);
        } else if (amountOfElements > 10 && amountOfElements <= 15) {
            priceToPay = 50 + (amountOfElements-10) * 4;
            System.out.println("Price is " + priceToPay);
        } else if (amountOfElements <= 10) {
            priceToPay = amountOfElements * 5;
            System.out.println("Price is " + priceToPay);
        }
        return priceToPay;

    }

    public static String returnText(int i) {
        String text;
        switch (i) {
            case 1:
                text="It's something";
                break;
            case 2:
                text="That's more like it";
                break;
            case 3:
                text="Way to go";
                break;
            default:
                text="That's a fail whale";
                break;


        }
        return text;

    }


}

