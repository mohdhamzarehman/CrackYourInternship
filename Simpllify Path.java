class Solution {
    public String simplifyPath(final String path) {
        final StringBuilder sb = new StringBuilder();  // Initialize a StringBuilder to build directory names
        final Stack<String> stack = new Stack<>();     // Use a stack to keep track of valid directories

        for (int i = 0; i < path.length() + 1; ++i) {  // Iterate through each character in the path
            if ((i == path.length() || path.charAt(i) == '/') && sb.length() > 0) {  // Check if end of directory name is reached
                final String directory = sb.toString();  // Get the directory name

                if (directory.equals("..") && !stack.isEmpty())  // ".." means to go back one directory, if possible
                    stack.pop();
                else if (!directory.equals("..") && !directory.equals("."))  // Ignore "." and push valid directory names
                    stack.push(directory);

                sb.setLength(0);  // Reset the StringBuilder for the next directory name
            } else if (i < path.length() && path.charAt(i) != '/') {
                sb.append(path.charAt(i));  // Append characters to build the directory name
            }
        }

        String result = "";

        while (!stack.isEmpty())
            result = "/" + stack.pop() + result;  // Build the result string from the stack

        return result.length() == 0 ? "/" : result;  // Return "/" if result is empty, otherwise return the result
    }
}
