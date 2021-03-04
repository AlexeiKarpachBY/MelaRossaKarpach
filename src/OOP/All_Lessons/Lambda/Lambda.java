package OOP.All_Lessons.Lambda;

import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x * y;
        int result = operation.calculate(2, 2);

        System.out.println(result);

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(2));
        System.out.println(isPositive.test(-1));

        
    }

}
