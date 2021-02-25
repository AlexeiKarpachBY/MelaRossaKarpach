package OOP.All_Lessons.FIVE;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("123");

        for (Object o : list) {
            System.out.println("-" + o);
        }
    }
}
