package OOP.All_Lessons.FIVE;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {
        Set hashSet = new TreeSet();
        int [] array  = new int [10];
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("b");



        System.out.println(hashSet);
    }
}
