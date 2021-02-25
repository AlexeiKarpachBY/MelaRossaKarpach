package OOP.All_Lessons.FIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("Proselyte", "java");
        hashMap.put("AsuaSmile", "UI");
        hashMap.put("Petre", "C++");
        hashMap.put("Ann", "PHP");

        System.out.println(hashMap);

        System.out.println("________________________________________________________________");

        Set set = hashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println(mapEntery.getKey() + ":" + mapEntery.getValue());
        }

        System.out.println("________________________________________________________________");

        Object speciality = hashMap.get("Proselyte");
        speciality += " developer(Changed)";
        hashMap.put("Proselyte", speciality);

        for (Object element : set) {
            Map.Entry mapEntery = (Map.Entry) element;
            System.out.println(mapEntery.getKey() + ":" + mapEntery.getValue());
        }

    }
}