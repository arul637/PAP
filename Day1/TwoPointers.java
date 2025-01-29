package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers {
    public static void main(String[] args) {
        int[] array = {-8, 10, 1, 3, 6, 7, 19, 10};
        Arrays.sort(array);

        System.out.print("Enter the sum to find: ");
        int key = new Scanner(System.in).nextInt();

        int left=0;
        int right=array.length-1;

        while (left < right) {
            if (array[left]+array[right] == key) {
                System.out.println("Found");
                break;
            } else if (array[left]+array[right] < key) {
                left++;
            } else {
                right--;
            }
        }
    }
}
