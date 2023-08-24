package collections;

import java.util.HashMap;

public class HashhSet {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(3);
        HashMap<String, Integer> hm2 = new HashMap<>(3);
        System.out.println(hm.isEmpty()); //T
        hm.put("CHinmay", 1);
        hm.put("THinmay", 1);
        hm2.putAll(hm); // puts all
        System.out.println(hm2);
        System.out.println(hm.size()); // 2
        System.out.println(hm.isEmpty()); // F
        hm.put("JHinmay", 1);
        hm.clear(); // cleares
        hm.put("Kinhay", 1);
        hm.remove("Kinhay"); // removes key with value
        hm.putIfAbsent("Jio", 63);

        System.out.println(hm);
        System.out.println(hm.size()); // 4
    }
}
