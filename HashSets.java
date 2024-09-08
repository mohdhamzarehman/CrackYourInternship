import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Moradabad");
        cities.add("Delhi");
        cities.add("Mumbai");
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.err.println(cities);
        // }
        for (String city : cities) { // cities hashset me jitni bhi city hai unhe return krdo
            System.out.println(city);
        }
    };
}
