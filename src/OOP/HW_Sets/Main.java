package OOP.HW_Sets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        SetOperations operations = new SetOperations();

        HashSet first = new HashSet();
        first.add("A");
        first.add("B");

        HashSet second = new HashSet();
        second.add("B");
        second.add("C");

        operations.union(first, second);
        System.out.println(first);

        /*operations.minus(first, second);
        System.out.println(first);

        operations.intersection(first, second);
        System.out.println(first);

        operations.difference(first, second);
        System.out.println(first);*/
    }
}
