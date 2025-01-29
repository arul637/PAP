package Day1;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] maxLeft = new int[array.length];
        int[] maxRight = new int[array.length];

        // 1. finding maximum left
        for(int i=0; i<array.length; i++) {
            int max;
            if (i==0) {
                max=0;
            } else {
                max=array[i-1];
            }
            for(int j=0; j<i; j++) {
                if(max<array[j]) {
                    max = array[j];
                }
            }
            maxLeft[i] = max;
        }

        // 2. finding maximum right
        for(int i=array.length-1; i>=0; i--) {
            int max;
            if (i==array.length-1) {
                max=0;
            } else {
                max=array[i+1];
            }
            for(int j=array.length-1; j>i; j--) {
                if(max<array[j]) {
                    max = array[j];
                }
            }
            maxRight[i] = max;
        }

        // min(L[i], R[i]) - array[i] >= 0 --> count+=1
        int count=0;
        for (int i=0; i<array.length; i++) {
            int calc = Math.min(maxLeft[i], maxRight[i])-array[i];
            if (calc >= 0) {
                count += calc;
            }
        }

        System.out.println(count);
    }
}
