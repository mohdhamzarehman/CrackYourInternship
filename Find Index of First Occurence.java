class Solution {
    // Method to find the first occurrence of the substring 'needle' in the string 'haystack'
    public int strStr(String haystack, String needle) {
        // Get the length of the haystack string
        int haylength = haystack.length();
        // Get the length of the needle string
        int needlelength = needle.length();
        // If the length of the needle is greater than the length of the haystack, return -1
        if(haylength < needlelength)
            return -1;
        // Iterate through the haystack string
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            // Check if the substring of haystack starting at i matches needle
            while(j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            // If the entire needle string is found in the haystack, return the starting index i
            if(j == needle.length()) {
                return i;
            }
        }
        // If the needle string is not found, return -1
        return -1;
    }
}
