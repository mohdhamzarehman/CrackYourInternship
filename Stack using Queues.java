class MyStack {
    // Queue ka object banaya, isme Integer type ke elements honge
    Queue<Integer> q = new LinkedList<>();
    
    // push method: isme hum stack mein element dalte hain
    public void push(int x) {
        // Element ko queue mein add kar diya
        q.add(x);
        
        // Queue ke elements ko aage peeche karne ka loop, taaki latest added element front mein aa jaye
        for(int i = 1; i < q.size(); i++){
            // Queue se ek element nikaala aur wapas queue mein dal diya
            q.add(q.poll());
        }
    }
    
    // pop method: isme hum stack se top element nikaalte hain
    public int pop() {
        // Queue se front element nikaal diya, jo stack ke hisaab se top element hota hai
        return q.poll();
    }
    
    // top method: stack ke top element ko return karta hai bina nikaale
    public int top() {
        // Queue ka front element return karta hai, jo stack ke hisaab se top element hota hai
        return q.peek();
    }
    
    // empty method: check karta hai ki stack khaali hai ya nahi
    public boolean empty() {
        // Agar queue khaali hai to true return karega, warna false
        return q.isEmpty();
    }
}

