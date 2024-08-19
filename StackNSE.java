public class Solution {
    // prevSmaller function: Har element ke liye previous smaller element find karta hai
    public int[] prevSmaller(int[] A) {
        Stack<Integer> st = new Stack<>(); // Stack banaya jo elements ko temporarily store karega
        int[] arr = new int[A.length]; // Answer array banaya jo har element ka previous smaller element store karega

        // Loop chala rahe hain poore array par
        for(int i = 0; i < A.length; i++) {
            // Jab tak stack khaali nahi ho jata aur stack ka top element current element se bada ya barabar hai, pop karte raho
            while(!st.isEmpty() && st.peek() >= A[i]) {
                st.pop();
            }
            // Agar stack khaali nahi hai to stack ka top element previous smaller element hoga
            if(!st.isEmpty()) {
                arr[i] = st.peek();
            }
            else {
                arr[i] = -1; // Agar stack khaali hai to previous smaller element nahi hai, to -1 store karo
            }
            // Current element ko stack mein push kar do
            st.push(A[i]);
        }
        return arr; // Answer array return kar do
    }
}
