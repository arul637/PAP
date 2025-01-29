package Day6;

public class FibonacciSeries {
    public static void series(int n) {
        System.out.println();
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i=2; i<n; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        series(6);
        series(10);
        series(20);
    }
}
