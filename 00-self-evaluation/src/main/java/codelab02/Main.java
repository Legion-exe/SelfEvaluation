package codelab02;


/**
 * Read the README.md for the assignment
 */
public class Main {

    public static void main(String[] args) {
        //1) Get the alphabet printed
        System.out.println(getAlphabet());

    }

    //1)
    public static char[] getAlphabet() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return alphabet;
    }

    //2)
    public static String[] replace3thElement(String[] strings) {
        if (strings == null || strings.length < 3) {
            System.out.println("Please do not ruin this exercise, I asked a min 4 string elements array...");
        }
        strings[2] = "do";
        return strings;

    }

}
