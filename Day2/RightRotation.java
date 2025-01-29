package Day2;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter the k times rotate: ");
        int k = new Scanner(System.in).nextInt();

        for (int value : array) {
            System.out.print(value + " ");
        }

        for (int i=0; i<k; i++) {
            int currentLast = array[array.length-1];
            int totalNumbers = array.length-1;
            while (totalNumbers>0) {
                array[totalNumbers] = array[totalNumbers-1];
                totalNumbers--;
            }
            array[0] = currentLast;
        }
        System.out.println();
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
