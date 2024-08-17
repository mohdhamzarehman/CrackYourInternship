class Pair {
    int x, y; // x value aur y minimum value ko store karne ke liye variables
    Pair(int x, int y) {
        this.x = x; // x ko initialize kar rahe hain
        this.y = y; // y ko initialize kar rahe hain
    }
}

class MinStack {
    Stack<Pair> st; // Pair objects ka stack banaya

    // MinStack ka constructor: Stack ko initialize kiya
    public MinStack() {
        st = new Stack<>();
    }

    // push method: Stack mein element push karne ke liye
    public void push(int x) {
        int min;
        // Agar stack khaali hai, to min value x hi hogi
        if (st.isEmpty()) {
            min = x;
        } else {
            // Warna, current element aur stack ke top element ka minimum nikaal kar min mein daal do
            min = Math.min(st.peek().y, x);
        }
        // Naya Pair banaya jisme x aur current min value hogi, aur usko stack mein push kar diya
        st.push(new Pair(x, min));
    }

    // pop method: Stack se top element ko nikaalne ke liye
    public void pop() {
        st.pop(); // Stack se top element ko nikaal diya
    }

    // top method: Stack ke top element ki value return karne ke liye
    public int top() {
        return st.peek().x; // Stack ke top Pair ka x value return kar diya
    }

    // getMin method: Stack mein ab tak ka minimum element return karne ke liye
    public int getMin() {
        return st.peek().y; // Stack ke top Pair ka y value (jo minimum hai) return kar diya
    }
}
