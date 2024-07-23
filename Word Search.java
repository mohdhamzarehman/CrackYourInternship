class Solution {
    // Helper method for Depth-First Search (DFS)
    private boolean dfs(char[][] board, String word, boolean[][] visited, int i, int[] u) {
        // If we have found the whole word, return true
        if (i >= word.length() - 1) return true;

        // Mark the current cell as visited
        visited[u[0]][u[1]] = true;

        // Define possible directions to move: right, left, down, up
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // Explore each direction
        for (int[] dir : dirs) {
            int vx = u[0] + dir[0]; // Calculate new row index
            int vy = u[1] + dir[1]; // Calculate new column index

            // Check if the new position is within bounds
            if (vx >= 0 && vx < board.length && vy >= 0 && vy < board[0].length) {
                // Check if the cell is not visited and matches the next character in the word
                if (!visited[vx][vy] && i + 1 < word.length() && board[vx][vy] == word.charAt(i + 1)) {
                    // Recursively perform DFS on the next cell
                    if (dfs(board, word, visited, i + 1, new int[]{vx, vy})) {
                        return true; // If the word is found, return true
                    }
                }
            }
        }

        // Unmark the current cell before backtracking
        visited[u[0]][u[1]] = false;

        return false; // Return false if the word is not found
    }

    // Method to check if the word exists in the board
    public boolean exist(char[][] board, String word) {
        int m = board.length; // Number of rows in the board
        int n = board[0].length; // Number of columns in the board

        // Iterate through each cell in the board
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                // If the cell matches the first character of the word
                if (board[i][j] == word.charAt(0)) {
                    // Initialize a visited matrix to keep track of visited cells
                    boolean[][] visited = new boolean[m][n];

                    // Perform DFS starting from the current cell
                    if (dfs(board, word, visited, 0, new int[]{i, j})) {
                        return true; // If the word is found, return true
                    }
                }
            }
        }

        return false; // Return false if the word is not found in the board
    }
}
