package SimpleTask;

public class FibonacciAndFactorial {

    public static int[] getFibonacciOrFactorial(int algorithm, int loopType, int n) {
        int[] result = new int[0];
        if (algorithm != 1 && algorithm != 2) {
            return result;
        }
        if (algorithm == 1) {
            result = getAllFactorial(loopType, n);
        }
        if (algorithm == 2) {
            result = getAllFibonacciNumbers(loopType, n);
        }
        return result;

    }

    public static int[] getAllFactorial(int loopType, int n) {
        int[] array = new int[1];

        if (loopType == 1) {
            array = getFactorialFor(n);
        }
        if (loopType == 2) {
            array = getFactorialWhile(n);
        }
        if (loopType == 3) {
            array = getFactorialDoWhile(n);
        }

        return array;
    }
    public static int[] getFactorialFor(int n) {
        int[] array = new int[1];
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        array[0] = result;

        return array;
    }
    public static int[] getFactorialWhile(int n) {
        int[] array = new int[1];
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        array[0] = result;

        return array;
    }
    public static int[] getFactorialDoWhile(int n) {
        int[] array = new int[1];
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;
        }
        while (i <= n);

        array[0] = result;
        return array;
    }

    public static int[] getAllFibonacciNumbers(int loopType, int n) {
        int[] result = new int[n];

        if (loopType == 1) {
            result = getFibonacciNumbersFor(n);
        }

        if (loopType == 2) {
            result = getFibonacciNumbersWhile(n);
        }

        if (loopType == 3) {
            result = getFibonacciNumbersDoWhile(n);
        }

        return result;
    }
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
            if (i > 1) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            i++;
        } while (i < numberOfValues);

        return fibonacciArray;
    }

}
