import java.util.*;

public class Hshing {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("India", 150);
        hm.put("US", 100);
        hm.put("Nepal", 50);
        hm.put("Canada", 80);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key = " + k + ",value = " + hm.get(k));
        }
    }
}