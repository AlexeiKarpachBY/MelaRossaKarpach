package OOP.All_Lessons.FIVE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestLinkeListHash {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put(2, "Proselyte");
        linkedHashMap.put(1, "AsuaSmile");
        linkedHashMap.put(3, "Petre");
        linkedHashMap.put(6, "Ann");

        System.out.println(linkedHashMap);

        System.out.println("________________________________________________________________");

        Set set = linkedHashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println(mapEntery.getKey() + ":" + mapEntery.getValue());
        }

        System.out.println("________________________________________________________________");

        Object name = linkedHashMap.get(2);
        name += " Changed";
        linkedHashMap.put(2, name);

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println("ID: " + mapEntery.getKey() + ", name: " + mapEntery.getValue());
        }

    }
}
