package Day6;

public class ClimbingStairs {
    public static int count(int n) {
        int[] array = new int[n+1];
        array[n] = 1;
        array[n-1] = 1;
        for (int i=n-2; i>=0; i--) {
            array[i] = array[i+1]+array[i+2];
        }
        return array[0];
    }
    public static void main(String[] args) {
        System.out.println(count(5));
    }
}
