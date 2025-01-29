package Day1;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 2, 4, 1};

        System.out.print("Enter the value of k: ");
        int key = new Scanner(System.in).nextInt();
        int max_value = Integer.MIN_VALUE;

        for (int i=0; i<=array.length-key-1; i++) {
            int currentSum = 0;
            for (int j=0; j<key; j++) {
                currentSum += array[i+j];
            }
            max_value = Math.max(currentSum, max_value);
        }

        System.out.println(max_value);
    }
}
