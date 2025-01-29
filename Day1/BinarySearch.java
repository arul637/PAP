package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {50, 30, 40, 20, 10, 90, 70, 60};
        Arrays.sort(array);

        int low = 0;
        int high = array.length-1;

        System.out.print("Enter the number to find: ");
        int key = new Scanner(System.in).nextInt();

        while (low <= high) {
            int mid = (low + high)/2;

            if (array[mid] == key) {
                System.out.println("Element is found at " + mid);
                break;
            } else if (array[mid] < key) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
    }
}
