package codelab03;

import java.util.Arrays;

/**
 * Read the README.md for the assignment
 */
public class Main {

    public static void main(String[] args) {

        //put the wanted size here (INT only)
        createArrayForSize(2);
    }

    public static char[][] createArrayForSize(int size) {
//let @ be a constant
        //"filling arrays"
        if (size < 2) {
            System.out.println("size must be >=2, thanks !");
        } else if (size == 2) {
            char[] arrayH = {'@', '@'};


            System.out.println(Arrays.toString(arrayH));
            System.out.println(Arrays.toString(arrayH));
        } else if (size > 2) {
            //Creation & filling arrays
            String[] arrayH = new String[size];
            String[] arrayV = new String[size];

            for (int i = 0; i < size; i++) {
                arrayH[i] = "@";
                arrayV[i] = " ";
            }

            //printing them in 2D
            System.out.println(Arrays.toString(arrayH));
            for (int i = 0; i < size - 2; i++) {
                //filling borders arrayV
                arrayV[0] = "@";
                arrayV[arrayV.length - 1] = "@";
                //printing
                System.out.println(Arrays.toString(arrayV));
            }
            System.out.println(Arrays.toString(arrayH));


        }


        return null;

    }
}


