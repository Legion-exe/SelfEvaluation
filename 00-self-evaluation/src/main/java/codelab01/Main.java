package codelab01;

public class Main {

    public static void main(String[] args) {
        // Hello world! printed
        System.out.println("Hello World!");
        //(2)put any string you want to see printed here
        printAny("Put Any String You Want Here");
        //(3)method overloading, put an int or a double here
        printNumber(1.12);
        //(4)Enter any INT value here
        numberPlusOne(0);

    }

    //2)
    private static void printAny(String printedString) {
        System.out.println(printedString);
    }

    //3)
    public static void printNumber(int anyNumber) {
        System.out.println("I'm an int: " + anyNumber);
    }

    public static void printNumber(double anyNumber) {
        System.out.println("I'm a double: " + anyNumber);
    }

    //4))
    private static void numberPlusOne(int anyInt) {
        int oldValue = anyInt;
        anyInt++;
        System.out.println("The value you entered was " + oldValue + ". And this value + 1 = " + anyInt);
    }

}
