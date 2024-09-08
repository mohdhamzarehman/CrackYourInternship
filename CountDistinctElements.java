import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 4, 2, 1, 5 };
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        System.out.println("Unique elements of the array are: " + s.size());
    }
}
