package OOP.All_Lessons.FIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();

        treeMap.put(2, "Proselyte");
        treeMap.put(1, "AsuaSmile");
        treeMap.put(3, "Petre");
        treeMap.put(6, "Ann");

        System.out.println(treeMap);

        System.out.println("________________________________________________________________");

        Set set = treeMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println(mapEntery.getKey() + ":" + mapEntery.getValue());
        }

        System.out.println("________________________________________________________________");

        Object name = treeMap.get(2);
        name += " Changed";
        treeMap.put(2, name);

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println("ID: " + mapEntery.getKey() + ", name: " + mapEntery.getValue());
        }

    }
}
