class Solution {
    // Method to generate all valid combinations of n pairs of parentheses
    public List<String> generateParenthesis(int n) {
        // List to store all valid combinations
        List<String> perm = new ArrayList<>();
        // Temporary array to store a single combination
        char[] temp = new char[n * 2];
        // Start the recursive generation of parentheses
        generateParenthesis(n, n, temp, 0, perm);
        // Return the list of valid combinations
        return perm;
    }

    // Recursive method to generate parentheses
    public void generateParenthesis(int leftrem, int rightrem, char[] temp, int pos, List<String> perm) {
        // Base case: invalid state (more right parentheses used or negative count)
        if (leftrem < 0 || rightrem < 0 || leftrem > rightrem) return;

        // Base case: valid combination found (no more parentheses left to add)
        if (leftrem == 0 && rightrem == 0) {
            perm.add(String.copyValueOf(temp));
            return;
        }

        // If we still have a left parenthesis to add, add it and recurse
        if (leftrem > 0) {
            temp[pos] = '(';
            generateParenthesis(leftrem - 1, rightrem, temp, pos + 1, perm);
        }

        // If we can add a right parenthesis (more left parentheses already added), add it and recurse
        if (rightrem > leftrem) {
            temp[pos] = ')';
            generateParenthesis(leftrem, rightrem - 1, temp, pos + 1, perm);
        }
    }
}
