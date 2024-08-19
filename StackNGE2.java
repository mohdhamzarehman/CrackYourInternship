class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n = nums.length;
        int maxIndex = 0;

        // Find the index of the maximum element in the array (O(n))
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        Stack<Integer> st = new Stack<>(); // Stack to hold elements temporarily
        int[] nge = new int[n]; // Array to store the next greater elements

        // Traverse the array starting from maxIndex and considering it circularly
        for (int i = maxIndex; i > maxIndex - n; i--) {
            int j = (n + i) % n; // Circular index

            // Pop elements from the stack until the top is greater than the current element
            while (!st.isEmpty() && st.peek() <= nums[j]) {
                st.pop();
            }

            // If the stack is empty, there is no greater element; otherwise, the top of the stack is the next greater element
            if (st.isEmpty()) {
                nge[j] = -1;
            } else {
                nge[j] = st.peek();
            }

            // Push the current element to the stack
            st.push(nums[j]);
        }

        return nge; // Return
    }
}
