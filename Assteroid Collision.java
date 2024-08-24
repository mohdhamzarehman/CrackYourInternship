import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            // Asteroid moving to the right
            if (asteroid > 0) {
                stack.push(asteroid); // Push to stack
            } else {
                // Asteroid moving to the left
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // Pop smaller right-moving asteroids
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids explode
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // Push left-moving asteroid if no collision
                }
            }
        }
        
        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
