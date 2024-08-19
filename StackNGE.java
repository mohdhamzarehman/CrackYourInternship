class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> st = new Stack<>(); // Stack banaya jo elements ko temporarily hold karega
        Map<Integer, Integer> mp = new HashMap<>(); // Map banaya jo har element ka next greater element store karega

        // Reverse order traversal kar rahe hain nums2 par
        for (int i = nums2.length - 1; i >= 0; i--) {
            // Jab tak stack khaali nahi hai aur stack ka top current element se chhota ya barabar hai, pop karte raho
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            // Agar stack khaali ho gaya, to map mein -1 daalo, kyunki koi next greater element nahi hai
            if (st.isEmpty()) {
                mp.put(nums2[i], -1);
            } else {
                // Warna stack ka top element next greater element hai, usko map mein daal do
                mp.put(nums2[i], st.peek());
            }
            // Current element ko stack mein push kar do
            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length]; // Answer ke liye array banaya

        // nums1 ke har element ka next greater element map se nikaal kar answer array mein daal do
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = mp.get(nums1[i]);
        }

        return ans;
    }
}
