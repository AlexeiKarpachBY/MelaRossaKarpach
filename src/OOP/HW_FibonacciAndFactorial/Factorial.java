package OOP.HW_FibonacciAndFactorial;


import OOP.Exceptions.FactorialExceptions;

public class Factorial {

    public int[] getAllFactorial(int loopType, int number) throws FactorialExceptions {
        if (loopType < 1 | loopType > 3) {
            throw new FactorialExceptions("The cycle is selected incorrectly");
        }

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

    public int[] getFactorialFor(int number) throws FactorialExceptions {
        int[] array = new int[1];
        if (number < 1) {
            throw new FactorialExceptions("Value less than or equal to 0");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            array[0] = result;
        }

        return array;
    }

    public int[] getFactorialWhile(int number) throws FactorialExceptions {
        int[] array = new int[1];
        if (number <= 0) {
            throw new FactorialExceptions("Value less than or equal to 0");
        } else {
            int result = 1;
            int i = 1;
            while (i <= number) {
                result = result * i;
                i++;
            }
            array[0] = result;
        }

        return array;
    }

    public int[] getFactorialFDoWhile(int number) throws FactorialExceptions {
        int[] array = new int[1];
        if (number <= 0) {
            throw new FactorialExceptions("Value less than or equal to 0");
        } else
            {
            int result = 1;
            int i = 1;
            do {
                result = result * i;
                i++;
            }
            while (i <= number);
            array[0] = result;
        }
        return array;
    }
}
