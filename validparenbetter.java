import java.util.*;

class TUF {
    // isValid function: Yeh function check karta hai ki given string `s` mein parentheses properly balanced hain ya nahi
    public static boolean isValid(String s) {
        // Ek stack banaya jisme characters store honge
        Stack<Character> st = new Stack<Character>();
        
        // Loop through each character of the string `s`
        for (char it : s.toCharArray()) {
            // Agar character '(' ya '[' ya '{' hai to usko stack mein push kar do
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else { 
                // Agar stack khaali hai aur closing bracket milta hai, to directly false return kar do
                if(st.isEmpty()) return false;
                
                // Stack ka top element nikaalo aur check karo ki kya woh matching opening bracket hai ya nahi
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) 
                    continue; // Agar matching bracket mil gaya to aage badho
                else 
                    return false; // Agar matching bracket nahi mila to false return kar do
            }
        }
        // Yahan tak agar poora string valid raha, to true return karo agar stack khaali ho (matlab saare brackets match ho gaye)
        return st.isEmpty();
    }
}
