package SimpleTask.HW_Practice;

public class Fibonacci {

    public static int[] getFibonacciNumbersFor(int numberOfValues) {

        int[] fibonacciArray = new int[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            fibonacciArray[0] = 1;
            if (i == 1) {
                fibonacciArray[i] = fibonacciArray[i - 1];
            }
            if (i > 1) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }
        return fibonacciArray;
    }

    public static int[] getFibonacciNumbersWhile(int numberOfValues) {

        int i = 0;
        int[] fibonacciArray = new int[numberOfValues];

        while (i < numberOfValues) {
            fibonacciArray[0] = fibonacciArray[1] = 1;
            if (i > 1) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            i++;
        }
        return fibonacciArray;
    }

    public static int[] getFibonacciNumbersDoWhile(int numberOfValues) {

        int i = 0;
        int[] fibonacciArray = new int[numberOfValues];

        do {
            fibonacciArray[0] = fibonacciArray[1] = 1;
            if (i > 1 ) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            i++;
        } while (i < numberOfValues);

        return fibonacciArray;
    }
}
