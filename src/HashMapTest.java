package src;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A",5);
        map.put("B", 2);
        map.put("C", 3);

        // Kalit-qiymat juftlarini iteratsiya qilish
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("Kalit: " + entry.getKey() + ", Qiymat: " + entry.getValue());
        }*/

        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("A",78);
        map.put("C", 3);

        // Kalit-qiymat juftlarini iteratsiya qilish va "B" elementini o'chirish
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            if (entry.getKey().equals("B")) {
                entryIterator.remove(); // "B" elementini o'chirish
            }
        }

        System.out.println("B'dan keyin: " + map); // {A=1, C=3}*/

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("B", 26);
        map.put("C", 3);

        // Qiymatlar to'plamini iteratsiya qilish
        Iterator<Integer> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            Integer value = valueIterator.next();
            System.out.println("Qiymat: " + value);
        }
    }
}
