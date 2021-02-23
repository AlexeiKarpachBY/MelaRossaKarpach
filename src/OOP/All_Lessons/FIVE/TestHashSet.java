package OOP.All_Lessons.FIVE;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set hashSet = new LinkedHashSet<>();
        int [] array  = new int [10];
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("5");
        hashSet.add("5");
        hashSet.add("5");
        hashSet.add("5");
        hashSet.add(5);
        hashSet.add("Five");

        hashSet.add(array);

        System.out.println(hashSet);
    }
}
