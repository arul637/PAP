package Day2;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter the k times rotate: ");
        int k = new Scanner(System.in).nextInt();

        for (int value : array) {
            System.out.print(value + " ");
        }

        for (int i=0; i<k; i++) {
            int currentFirst = array[0];
            int j = 0;
            while (j<array.length-1) {
                array[j] = array[j+1];
                j++;
            }
            array[array.length-1] = currentFirst;
        }
        System.out.println();
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
