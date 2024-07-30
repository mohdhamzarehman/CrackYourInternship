class Solution {
    // Method to find the longest common prefix string amongst an array of strings
    public String longestCommonPrefix(String[] strs) {
        // Sort the array of strings
        Arrays.sort(strs);
        // Get the first string in the sorted array
        String s1 = strs[0];
        // Get the last string in the sorted array
        String s2 = strs[strs.length - 1];
        // Initialize the index for the common prefix
        int idx = 0;
        // Loop through characters of the first and last strings
        while(idx < s1.length() && idx < s2.length()) {
            // If characters match, increment the index
            if(s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                // If characters do not match, break the loop
                break;
            }
        }
        // Return the common prefix substring from the first string
        return s1.substring(0, idx);
    }
}
