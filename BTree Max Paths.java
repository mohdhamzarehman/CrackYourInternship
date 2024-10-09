class Solution {
    // Function to calculate the maximum path sum
    public int maxPathSum(TreeNode root) {
        // Initialize maxi to the minimum possible integer value
        int[] maxi = {Integer.MIN_VALUE};

        // Call the recursive function to find the maximum path sum
        findMaxPathSum(root, maxi);

        // Return the final maximum path sum
        return maxi[0];
    }

    // Recursive function to find the maximum path sum
    private int findMaxPathSum(TreeNode root, int[] maxi) {
        // Base case: If the current node is null, return 0
        if (root == null) {
            return 0;
        }

        // Calculate the maximum path sum for the left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left, maxi));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right, maxi));

        // Update the overall maximum path sum including the current node
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.val);

        // Return the maximum sum considering only one branch (either left or right) along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.val;
    }
}
