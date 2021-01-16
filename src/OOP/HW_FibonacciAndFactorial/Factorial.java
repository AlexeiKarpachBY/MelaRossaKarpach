package OOP.HW_FibonacciAndFactorial;


public class Factorial {

    public int[] getAllFactorial(int loopType, int number) {
        if (loopType == 1) {
            return getFactorialFor(number);
        }
        if (loopType == 2) {
            return getFactorialWhile(number);
        }
        if (loopType == 3) {
            return getFactorialFDoWhile(number);
        }
        return new int[0];
    }

    public int[] getFactorialFor(int number) {
        int[] array = new int[1];
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        array[0] = result;

        return array;
    }

    public int[] getFactorialWhile(int number) {
        int[] array = new int[1];
        int result = 1;
        int i = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        array[0] = result;

        return array;
    }

    public int[] getFactorialFDoWhile(int number) {
        int[] array = new int[1];
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;
        }
        while (i <= number);

        array[0] = result;
        return array;
    }
}
