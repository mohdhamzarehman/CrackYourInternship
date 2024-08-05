class Solution {
    public int calculate(String str) {
        
Stack<Integer> s = new Stack<>();
        char x = '+';
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                sum = sum * 10 + (c - '0');
            }

            // Check for end of number or end of string
            if ((!Character.isDigit(c) && c != ' ') || i == str.length() - 1) {
                // Handle the last operation or number
                if (x == '+') {
                    s.push(sum);
                } else if (x == '-') {
                    s.push(-sum);
                } else if (x == '*') {
                    s.push(s.pop() * sum);
                } else if (x == '/') {
                    s.push(s.pop() / sum);
                }

                // Update the current operator
                x = c;
                sum = 0;
            }
        }

        // Calculate the final result
        int result = 0;
        while (!s.isEmpty()) {
            result += s.pop();
        }

        return result;
    }
}
