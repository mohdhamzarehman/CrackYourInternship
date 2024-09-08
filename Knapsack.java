import java.util.*;

public class Knapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th column -> index 1st column -> ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // now into descending order
        int capacity = W; // poore bag me full jagah hai
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // agar esa hai to poora item daal do
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {// warna fractional value daal do
                finalVal += val[idx] * (capacity / (double) weight[idx]);
                break;
            }
        }
        System.out.println("Final value =" + finalVal);
    }
}