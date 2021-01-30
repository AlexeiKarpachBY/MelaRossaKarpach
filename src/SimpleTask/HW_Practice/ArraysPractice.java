package SimpleTask.HW_Practice;

import java.util.Arrays;

public class ArraysPractice {

    public static int getArithmeticMean(int[] numbers) {

        int arithmeticMean = 0;
        int total = 0;

        for (int x : numbers) {
            total = total + x;
            arithmeticMean = total / numbers.length;
        }
        return arithmeticMean;
    }

    public static int[] getArithmeticArray(int[] numbers) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < getArithmeticMean(numbers)) {
                count = count + 1;
            }
        }

        int[] desiredArray = new int[count];
        int j = 0;
        for (int k : numbers) {

            if (k < getArithmeticMean(numbers)) {
                desiredArray[j] = k;
                j++;
            }
        }
        return desiredArray;
    }

    public static int[] getTwoMinimumValues(int[] numbers) {

        int firstMin = 0;
        int secondMin = 0;
        int[] array = new int[2];
        for (int k : numbers) {
            if (k < firstMin) {
                firstMin = k;
                array[0] = firstMin;
                for (int j : numbers) {
                    if (j < secondMin && j > firstMin) {
                        secondMin = j;
                        array[1] = secondMin;

                    }
                }
            }
        }
        return array;
    }

    public static int[] outputFromArray(int[] numbers, int x) {
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        for (int i : numbers) {
            if (i == x) {
                count++;
            }
        }
        System.out.println(count);
        int[] array = new int[numbers.length - count];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != x) {
                array[0] = numbers[i];
            }
            if (numbers[i] == x) {
                System.out.println("hi");
            }
        }
        return array;
    }
}
