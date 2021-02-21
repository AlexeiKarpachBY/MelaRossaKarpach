package OOP.HW_FibonacciAndFactorial;

import OOP.Exceptions.MathAlgoritmsManagerExceptions;

public class MathAlgoritmsManager {

    public int[] getMathAlgorithm(int algorithm, int loopType, int number) {
        int[] result = new int[0];

        try {
            if (algorithm != 1 && algorithm != 2) {
                return result;
            }
            if (algorithm == 1) {
                Factorial factorial = new Factorial();
                result = factorial.getAllFactorial(loopType, number);
            }
            if (algorithm == 2) {
                Fibonacci fibonacci = new Fibonacci();
                result = fibonacci.getAllFibonacci(loopType, number);
            }
        } catch (MathAlgoritmsManagerExceptions e) {
            e.printStackTrace();
        }

        return result;
    }

}
