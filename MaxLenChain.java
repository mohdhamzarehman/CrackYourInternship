import java.util.*;

public class MaxLenChain {
    public static void main(String[] args) {

        int[][] arr = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1])); // sort
        int Chainlen = 1;
        int ChainEnd = arr[0][1];
        for (int i = 0; i < arr.length; i++) { // iterate
            if (arr[i][0] > ChainEnd) { // if current element is greater than ChainEnd
                ChainEnd = arr[i][1]; // update
                Chainlen++; // increment
            }
        }
        System.out.println(Chainlen);
    }
}
