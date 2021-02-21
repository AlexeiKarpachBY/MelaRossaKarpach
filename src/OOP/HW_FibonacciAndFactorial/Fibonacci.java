package OOP.HW_FibonacciAndFactorial;


import OOP.Exceptions.FibonacciExceptions;

public class Fibonacci {

    public int[] getAllFibonacci(int loopType, int number) throws FibonacciExceptions {
        if (loopType < 1 | loopType > 3) {
            throw new FibonacciExceptions("The cycle is selected incorrectly");
        }

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

    public int[] getFibonacciNumbersFor(int number) throws FibonacciExceptions {
        int[] fibonacciArray = new int[number];
        if (number < 2) {
            throw new FibonacciExceptions("The value must be greater than 1");
        } else {
            for (int i = 0; i < number; i++) {
                fibonacciArray[0] = 1;
                if (i == 1) {
                    fibonacciArray[i] = fibonacciArray[i - 1];
                }
                if (i > 1) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
            }
        }
        return fibonacciArray;
    }

    public int[] getFibonacciNumbersWhile(int number) throws FibonacciExceptions {
        int i = 0;
        int[] fibonacciArray = new int[number];
        if (number < 2) {
            throw new FibonacciExceptions("The value must be greater than 1");
        } else {
            while (i < number) {
                fibonacciArray[0] = fibonacciArray[1] = 1;
                if (i > 1) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
                i++;
            }
        }
        return fibonacciArray;
    }

    public int[] getFibonacciNumbersDoWhile(int number) throws FibonacciExceptions {
        int[] fibonacciArray = new int[number];
        if (number < 2) {
            throw new FibonacciExceptions("The value must be greater than 1");
        }
        else {
            int i = 0;

            do {
                fibonacciArray[0] = fibonacciArray[1] = 1;
                if (i > 1) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
                i++;
            } while (i < number);
        }
        return fibonacciArray;
    }
}
