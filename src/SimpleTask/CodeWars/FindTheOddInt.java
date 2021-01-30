package SimpleTask.CodeWars;

import java.util.Arrays;

       /* Given an array of integers,find the one that appears an odd number of times.

        There will always be only one integer that appears an odd number of times.*/

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        System.out.println(findIt(array));
    }

    public static int findIt(int[] a) {
        int odd = 0;

        for (int k : a) {
            int count = 0;
            for (int j : a) {
                if (k == j) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                odd = k;
            }
        }
        return odd;
    }
}



