package Day5;

/*
You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:

Choose the pile with the maximum number of gifts.
If there is more than one pile with the maximum number of gifts, choose any.
Reduce the number of gifts in the pile to the floor of the square root of the original number of gifts in the pile.
Return the number of gifts remaining after k seconds.
*/

import java.util.Arrays;

public class TakeGiftsFromPiles {

    public int findMaxPos(int[] array) {
        int max = array[0];
        int pos = 0;
        for (int i=1; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        TakeGiftsFromPiles tgfp = new TakeGiftsFromPiles();
        int[] array = {25,64,9,4,100};
        int k = 4;
        for (int i=0; i<k; i++) {
           int pos = tgfp.findMaxPos(array);
           array[pos] = (int) Math.floor(Math.sqrt(array[pos]));
        }
        System.out.println(Arrays.stream(array).sum());
    }
}
