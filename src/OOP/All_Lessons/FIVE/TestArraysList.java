package OOP.All_Lessons.FIVE;

import java.util.ArrayList;
import java.util.List;

public class TestArraysList {
    public static void main(String[] args) {
        List arraylist = new ArrayList<>();
        arraylist.add("First");
        arraylist.add("Two");
        arraylist.add("Three");
        arraylist.add("Four");
        arraylist.add("Five");

        System.out.println(arraylist.size());
        System.out.println(arraylist);

        arraylist.remove("Three");
        arraylist.remove(1);


        System.out.println(arraylist.size());
        System.out.println(arraylist);
    }
}
