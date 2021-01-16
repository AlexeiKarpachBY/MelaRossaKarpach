package OOP.HW_FibonacciAndFactorial;


public class Fibonacci {

    public int[] getAllFibonacci(int loopType, int number) {
        if (loopType == 1) {
            return getFibonacciNumbersFor(number);
        }
        if (loopType == 2) {
            return getFibonacciNumbersWhile(number);
        }
        if (loopType == 3) {
            return getFibonacciNumbersDoWhile(number);
        }
        return new int[0];
    }

    public int[] getFibonacciNumbersFor(int number) {
        int[] fibonacciArray = new int[number];

        for (int i = 0; i < number; i++) {
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

    public int[] getFibonacciNumbersWhile(int number) {
        int i = 0;
        int[] fibonacciArray = new int[number];

        while (i < number) {
            fibonacciArray[0] = fibonacciArray[1] = 1;
            if (i > 1) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            i++;
        }
        return fibonacciArray;
    }

    public int[] getFibonacciNumbersDoWhile(int number) {
        int i = 0;
        int[] fibonacciArray = new int[number];

        do {
            fibonacciArray[0] = fibonacciArray[1] = 1;
            if (i > 1) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            i++;
        } while (i < number);

        return fibonacciArray;
    }
}
