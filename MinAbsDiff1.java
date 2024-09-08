import java.util.*;

public class MinAbsDiff1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();
        int Pairs = 0;
        for (int i = 1; i < arr.length; i++) {
            min_diff = Math.min(arr[i] - arr[i - 1], min_diff);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min_diff) {
                List<Integer> pair = new ArrayList();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}