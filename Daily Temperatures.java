class Solution {
    public int[] dailyTemperatures(int[] temperatures) { // Method jo temperatures array ko input lega aur result array return karega
        int[] res = new int[temperatures.length]; // Result array ko initialize kar rahe hain
        Stack<int[]> st = new Stack<>(); // Stack ko initialize kar rahe hain, yeh pair store karega [temp, index]

        for(int i = 0; i < temperatures.length; i++) { // Har temperature ke liye loop
            while(!st.isEmpty() && temperatures[i] > st.peek()[0]) { // Jab tak stack empty na ho aur current temp stack ke top se bada ho
                int[] temp = st.pop(); // Stack se top element nikal rahe hain
                res[temp[1]] = i - temp[1]; // Result array mein days difference store kar rahe hain
            }
            st.push(new int[]{temperatures[i], i}); // Current temperature aur index ko stack mein push kar rahe hain
        }

        return res; // Result array return kar rahe hain
    }
}
